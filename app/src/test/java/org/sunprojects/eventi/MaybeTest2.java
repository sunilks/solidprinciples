package org.sunprojects.eventi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author sunil
 */
public class MaybeTest2 {
    private static final Logger logger = LogManager.getLogger(MaybeTest2.class);
    public static void main(String[] args) {
        var v = new Maybe<String>();
        var w = new Maybe<String>("");
        
        try {
            if(v.isPresent()){
                logger.info("V is EMPTY");
            } else {
                v.getValue();
            }
            
            if (w.isPresent()){
                logger.info("W has Value");
            }
        } catch (Exception ex) {
            logger.error(ex);
            ex.printStackTrace();
        }
    }
}
