public static void max(int array[],int max) {
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println(max);
	}
//time complexity is o(n)
