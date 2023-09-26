public class ScannerMachine {
    static void scanDocument(String document, int resolution, String format) {
        
		System.out.println("Scanning document: " + document + " with resolution " + resolution + " dpi, format: " + format);
        if ( resolution  >=100 )
		{
		System.out.println("resolution is high");
		//return;
		}
		else
		{
			System.out.println("resolution is loo");	
		}    
	}

    static void saveDocument(String document, String filename, String format) {
        System.out.println("Saving document: " + document + " as " + filename + "." + format);
		if(format=="JPEG")
		{System.out.println("file in proper format");}
	else
	{
		System.out.println("file is not in proper format");
    }
	}

    static void printDocument(String document, int copies) {
        System.out.println("Printing document: " + document + " - Number of copies: " + copies);
		
		if ( copies >=1 )
		{
		System.out.println("printed multiple pages");
		return;
		}
		else
		{
			System.out.println("printed pages");	
		}
    }

    static void turnOff() {
        System.out.println("Turning off the scanner machine...");
    }
}
