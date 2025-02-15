package mutidimentional_array;

public class multi_dim_array {
	public static void main(String[] args) {
		
	//	int arr []= {1,2,3,7,1};
	//	System.out.println(arr.length);
		
	//	int arr1 [][]=new int [3][4];
		
	//	System.out.println(arr1[1][2]);
		
	//	arr1[0][0]=4;
	//	arr1[0][1]=5;
		
	//	System.out.println(arr1[0][0]);
	//	System.out.println(arr1[0][1]);
	//	System.out.println(arr1[3][1]);  	//it is an error because the index number 3 is not available in the rows in the array
		
		// if there is an index number that is valid but the value is not mentioned then it will show 0 as the default value
		 	
	//	int arr2[][]= {{1,2,3,4},{4,3,2,1}};	//declaration directly to the multi dimensional arrays.
		// it is a multi dimensional array
		//we can know the length of the array like 2 x 4 cause it is 2 rows and there are 4 column given.
		
	//	for (int i=0;i<2;i++)
	//	{
	//		for(int j=0;j<4;j++)
	//		{
	//			System.out.println(arr2 [i][j]+"  ");
	//		}
	//	}
		
		int arr3[]= {1,2,5,9};
		int arr4[]= {7,4,8,6};
		
    int arr5[][]=new int [2][4];
	arr5[0][0]= arr3[0]+arr4 [0];
	arr5[0][1]= arr3[1]+arr4[1];
	arr5[0][2]= arr3[2]+arr4 [2];
	arr5[0][3]= arr3[3]+arr4 [3];
  
	for (int i=0;i<1;i++)
	{
		for (int j=0;j<4;j++)
		{
			System.out.println(arr5[i][j]);
		}
	
	}
		
		
		
	}

}
