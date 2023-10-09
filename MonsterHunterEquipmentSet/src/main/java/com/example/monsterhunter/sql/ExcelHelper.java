package com.example.monsterhunter.sql;

import com.example.monsterhunter.domain.EquipmentList;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;


public class ExcelHelper {

    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERs = { "name", "type", "slots", "skill", "skillLevel", "defensePoints", "fireRes", "waterRes", "lightningRes", "iceRes", "dragonRes" };
    static String SHEET = "EquipmentList";

    public static boolean hasExcelFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<EquipmentList> excelToEquipmentList(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<EquipmentList> equipmentLists = new ArrayList<>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                EquipmentList equipmentList = new EquipmentList();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0 -> equipmentList.setName(currentCell.getStringCellValue());
                        case 1 -> equipmentList.setType(currentCell.getStringCellValue());
                        case 2 -> equipmentList.setSlots((long) currentCell.getNumericCellValue());
                        case 3 -> equipmentList.setSkill(currentCell.getStringCellValue());
                        case 4 -> equipmentList.setSkillLevel((long) currentCell.getNumericCellValue());
                        case 5 -> equipmentList.setDefensePoints((long) currentCell.getNumericCellValue());
                        case 6 -> equipmentList.setFireRes((long) currentCell.getNumericCellValue());
                        case 7 -> equipmentList.setWaterRes((long) currentCell.getNumericCellValue());
                        case 8 -> equipmentList.setLightningRes((long) currentCell.getNumericCellValue());
                        case 9 -> equipmentList.setIceRes((long) currentCell.getNumericCellValue());
                        case 10 -> equipmentList.setDragonRes((long) currentCell.getNumericCellValue());
                    }
                    cellIdx++;
                }
                equipmentLists.add(equipmentList);
            }

            workbook.close();

            return equipmentLists;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}
