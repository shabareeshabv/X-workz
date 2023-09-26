class Baker{
static void cooking(String fooditems,int noOfPeople,String cookingfor, int experiance ,int duration, String assistance ){
System.out.println("items is " + fooditems);
if (fooditems=="Milk") {
            System.out.println("item  is correct");
        } else {
            System.out.println("item is wrong");
            // return;
        }
System.out.println("items is " + noOfPeople);
if (noOfPeople==4) {
            System.out.println(" there are 4 people are there");
        } else {
            System.out.println(" some people are working");
            // return;
        }
System.out.println("items is  " +cookingfor);
if (cookingfor=="Family Dinner") {
            System.out.println("cookingfor  is family dinner");
        } else {
            System.out.println("item is wrong");
            // return;
        }
System.out.println("items is  " +experiance);
if (experiance>=5) {
            System.out.println(" workers are experianced");
        } else {
            System.out.println("workers are freshers");
            // return;
        }
System.out.println("items is  " +duration);
if (duration>=10) {
            System.out.println("duration is above 10 years");
        } else {
            System.out.println("duration is below 10 years");
            // return;
        }
System.out.println("items is " + assistance);
if (assistance=="none") {
            System.out.println(" no assistance");
        } else {
            System.out.println("assistance");
            // return;
        }

}
}