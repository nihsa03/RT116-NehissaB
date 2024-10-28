package org;

public class SBA {
    class Cricket implements Sport{
        private int[] playerIDs;

        public Cricket (){
            playerIDs= new int[11];
            for (int i=0;i<playerIDs.length;i++){
                playerIDs[i]= 1;
            }
            System.out.println("A new cricket team has been formed");
        }


        @Override
        public void calculateAvgAge(int[] age){
            double sum= 0;
            for (int a :age){
                sum=sum +a ;
            }
            double AvgAge= sum/age.length;
            System.out.println("The average age of the team is "+AvgAge);
        }


        @Override
        public void retirePlayer(int id){
            if (playerIDs[id] == -1){
                System.out.println("Player with id: "+id +"has retired");
            }else {
                playerIDs[id] == -1;
                System.out.println("Player has already retired");
            }
        }
    }


    class Football implements Sport {
        private int[] playerIDs;

        public Football (){
            playerIDs= new int[11];
            for (int i=0;i<playerIDs.length;i++){
                playerIDs[i]= 1;
            }
            System.out.println("A new football team has been formed");
        }


        @Override
        public void calculateAvgAge(int[] age){
            double sum= 0;
            for (int a :age){
                sum=sum +a ;
            }
            double AvgAge= sum/age.length;
            System.out.println("The average age of the team is "+AvgAge);
        }


        @Override
        public void retirePlayer(int id){
            if (playerIDs[id] == -1){
                System.out.println("Player with id: "+id +"has TRANS");
            }else{
                playerIDs[id] = -1;
                System.out.println("Player has already retired");
            }
        }


        public void playerTransfer (int fee,int id){
            if (playerIDs[id]= -1){
                System.out.println("Player with id: "+id +"has been transferred with a fee of "+ fee);
            }else{
                playerIDs[id] == -1;
                System.out.println("Player has already retired");
            }
        }
    }


}
