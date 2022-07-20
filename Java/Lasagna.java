public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return 40;
        }
 
    // TODO: define the 'remainingMinutesInOven()' method

           public int remainingMinutesInOven(int time){
            time = 40 - time;
            return time;
        } 

    // TODO: define the 'preparationTimeInMinutes()' method

            public int preparationTimeInMinutes(int layers){
                int preptime = layers * 2;
                return preptime;
            }

    // TODO: define the 'totalTimeInMinutes()' method

        public int totalTimeInMinutes(int layers, int remtime){

            int tottime = (2*layers)+remtime;
            return tottime;
            
        }
        
    
}
