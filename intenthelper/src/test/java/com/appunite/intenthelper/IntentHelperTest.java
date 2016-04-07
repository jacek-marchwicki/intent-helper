package com.appunite.intenthelper;

import org.junit.Test;

import static com.google.common.truth.Truth.assert_;

public class IntentHelperTest {

    @Test
    public void testTestIfIsWorking_returnsWorking() throws Exception {
        final IntentHelper intentHelper = new IntentHelper();

        final String itWorking = intentHelper.isItWorking();

        assert_().that(itWorking).is("working");
    }
}
