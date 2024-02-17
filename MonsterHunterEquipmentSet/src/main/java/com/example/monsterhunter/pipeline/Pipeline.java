package com.example.monsterhunter.pipeline;

import com.example.monsterhunter.steps.Step;

public class Pipeline <INPUT,OUTPUT>{
    private  Step<INPUT,OUTPUT> current;
    Pipeline(Step<INPUT,OUTPUT> current) {
        this.current = current;
    }

    <NewOUTPUT> Pipeline<INPUT, NewOUTPUT> pipe(Step<OUTPUT, NewOUTPUT> next) {
        return new Pipeline<> (input -> next.process(current.process(input)));
    }

    public OUTPUT execute (INPUT input) throws Step.StepException {
        return current.process(input);
    }
}
