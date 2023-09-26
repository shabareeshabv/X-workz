class Fabric1
{
	static int getPrice(String fabricName)
	{
		System.out.println("Invoking getPrice() in Fabric");
		if(fabricName!=null)
		{
			System.out.println("Fabric Name is Valid");
			if(fabricName=="cotton")
			{
				return 2590;
			}
			if(fabricName=="nylon")
			{
				return 2100;
			}
			if(fabricName=="woolen")
			{
				return 1800;
			}
			if(fabricName=="linen")
			{
				return 1900;
			}
			if(fabricName=="polyster")
			{
				return 2000;
			}
			if(fabricName=="silk")
			{
				return 3000;
			}
		}
		else
			{
			System.err.println("Fabric is not valid");
		}
		return 100;
	}
}
