package com.example.monsterhunter.sql;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
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
    static String[] HEADERS = { "name", "type", "slots", "skill", "skillLevel", "defensePoints", "fireRes", "waterRes", "lightningRes", "iceRes", "dragonRes" };
    static String SHEET1 = "EquipmentList";
    static String SHEET2 = "SkillList";

    public static boolean hasExcelFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<EquipmentList> excelToEquipmentList(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET1);
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
                        case 0:
                            equipmentList.setName(currentCell.getStringCellValue());
                            break;

                        case 1:
                            equipmentList.setType(currentCell.getStringCellValue());
                            break;

                        case 2:
                            equipmentList.setSlots((long) currentCell.getNumericCellValue());
                            break;
                        case 3:
                            equipmentList.setDefensePoints((long) currentCell.getNumericCellValue());
                            break;
                        case 4:
                            equipmentList.setFireRes((long) currentCell.getNumericCellValue());
                            break;
                        case 5:
                            equipmentList.setWaterRes((long) currentCell.getNumericCellValue());
                            break;
                        case 6:
                            equipmentList.setLightningRes((long) currentCell.getNumericCellValue());
                            break;
                        case 7:
                            equipmentList.setIceRes((long) currentCell.getNumericCellValue());
                            break;
                        case 8:
                            equipmentList.setDragonRes((long) currentCell.getNumericCellValue());
                            break;

                        default:
                            break;
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

    public static List<SkillList> excelToSkillList(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);

            Sheet sheet = workbook.getSheet(SHEET2);
            Iterator<Row> rows = sheet.iterator();

            List<SkillList> skillLists = new ArrayList<>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                SkillList skillList = new SkillList();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                    switch (cellIdx) {
                        case 0:
                            skillList.setName(currentCell.getStringCellValue());
                            break;
                        case 1:
                            skillList.setSkill(currentCell.getStringCellValue());
                            break;
                        case 2:
                            skillList.setSkillLevel((long) currentCell.getNumericCellValue());
                            break;
                        default:
                            break;
                    }

                    cellIdx++;
                }

                skillLists.add(skillList);
            }

            workbook.close();

            return skillLists;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}