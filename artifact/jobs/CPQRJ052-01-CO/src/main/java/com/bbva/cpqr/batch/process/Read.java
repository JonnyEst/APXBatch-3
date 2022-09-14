package com.bbva.cpqr.batch.process;

import com.bbva.cpqr.lib.r052.CPQRR052;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.IOException;
import java.text.ParseException;

public class Read implements Tasklet {
    private String inPath;
    private CPQRR052 cpqrR052;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)  throws IOException, ParseException {
        return null;
    }

    public void setInPath(String inPath) {
        this.inPath = inPath;
    }

    public void setCpqrR052(CPQRR052 cpqrR052) {
        this.cpqrR052 = cpqrR052;
    }
}
