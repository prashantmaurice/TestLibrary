package com.prashantmaurice.androidtestlibrary;

/**
 * Created by maurice on 01/06/16.
 */
public class MediaSelector {

    public class IntentBuilder{
        private boolean pickMultiple;

        public IntentBuilder(){

        }

        public IntentBuilder pickMultiple(boolean pickMultiple){
            this.pickMultiple = pickMultiple;
            return this;
        }

    }

}
