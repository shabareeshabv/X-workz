class PersonName1 {

    static int getAgeByName(String personName) {
        if (personName != null) {
            System.out.println("getAgeByName is valid");
             if (personName=="shabareesha")  {
                return 23;
            }  if ( personName=="vinay") {
                return 23;
            }if ( personName=="sooraj") {
                return 25;
            }  if ( personName=="raghu") {
                return 20;
            } if (personName=="anusha" ){
                return 21;
            } if  (personName=="priyanka" ) {
                return 20;
            } if ( personName=="Vishwa"){
                return 25;
            }  if (personName=="Varsha"){
                return 22;
            } if ( personName=="akash"){
                return 21;
            }if (  personName=="karthik") {
                return 20;
            }
        } else {
            System.out.println("name is invalid");
        }
        return 00;
    }
}
