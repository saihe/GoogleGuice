package ksaito.guice.batch.b001;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RunnerTest {
    @Mock
    private Runner runner;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void run() {
        Mockito.doNothing().when(runner).run();
    }
}