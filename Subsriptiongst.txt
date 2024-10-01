public class Subscription{

        public static void main(String args[]){
           int totalFee = 500;
           int numberOfPersons = 5;
           int feePerPerson = totalFee/numberOfPersons;
           int gstPerperson = 0.18 * feePerPerson 
           int totalGst = gstPerperson * 5
           System.out.println("Subscription fee per person:"+feePerPerson);
           System.out.println("Gst per person:"+gstPerperson);
           System.out.println("Total Gst:"+totalGst);
         }

}