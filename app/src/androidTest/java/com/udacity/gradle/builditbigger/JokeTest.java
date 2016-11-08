package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Created by akash on 11/8/16.
 */

public class JokeTest extends AndroidTestCase {

    private String joke = null;

    public void testGetJoke() {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(mContext);
        try {
            joke = asyncTask.get();
        } catch (InterruptedException e) {
            joke = null;
            e.printStackTrace();
        } catch (ExecutionException e) {
            joke = null;
            e.printStackTrace();
        }
        assertNull(joke);
    }


}