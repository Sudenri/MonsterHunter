package com.example.monsterhunter.steps;

public interface Step<INPUT, OUTPUT>{
    public static class StepException extends RuntimeException {
        public StepException(Throwable t) {
            super(t);
        }
    }
    public OUTPUT process (INPUT input) throws StepException;
}

