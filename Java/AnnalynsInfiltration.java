class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
                if(knightIsAwake){
                    return false;
                        }else{
                            return true;
                                    }
        }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
            if(knightIsAwake){
                return true;
            }else if(prisonerIsAwake){
                return true;
            }else if(archerIsAwake){
                return true;
                }else {
                return false;
            }
        
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
       // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
                if(archerIsAwake){
                    return false;
                }else if(prisonerIsAwake){
                        return true;
                    }else{
                        return false;
                    }
        }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
      // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");

                if(petDogIsPresent){
                        if(archerIsAwake){
                                return false;
                                         }else{
                                        return true;
                                     }
                    }else{
                        if(prisonerIsAwake){
                            if(knightIsAwake){
                                return false;
                            }else if(archerIsAwake){
                                return false;
                            }
                            else{
                                return true;
                            }
                        }else{
                            return false;
                        }
                    
                    }
                }

        
    }
