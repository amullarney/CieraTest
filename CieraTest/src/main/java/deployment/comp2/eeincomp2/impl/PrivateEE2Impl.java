package deployment.comp2.eeincomp2.impl;


import deployment.comp2.eeincomp2.PrivateEE2;

import io.ciera.runtime.summit.components.IComponent;
import io.ciera.runtime.summit.util.Utility;


public class PrivateEE2Impl<C extends IComponent<C>> extends Utility<C> implements PrivateEE2 {


    public PrivateEE2Impl( C context ) {
        super( context );
    }

    public int privateBrgOp() {
        // Insert your implementation here
       return 88;
    }

 }
