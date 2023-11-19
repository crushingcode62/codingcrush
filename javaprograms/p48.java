class p48
{
    public static void main(String arg[])
    {
        // Declare and initialize four integer variables say totalMatches, , totalRuns, innings and notOut
        int totalMatches=10,totalRuns=500,innings=20,notOut=3;
        //Declare an another double  variable to store the computed value
        double avg;
        avg=totalRuns/(innings-notOut);
        //Print the result
        System.out.println("The batting average= "+avg);
   }
} 