package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by akash on 11/8/16.
 */

public class JokeTest extends AndroidTestCase {

    private String joke = null;

    public JokeTest() {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(mContext);
        try {
            joke = asyncTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Timed Out");
        }
    }
}