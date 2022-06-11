public static void second(int array[]) {
		int largest=0;
		int second=-1;
		for(int i=0;i<array.length;i++){
			if(array[i]>array[largest]) {
				second=largest;
				largest=i;}
			else if(array[i]<array[largest]) {
				if(second==-1|| array[i]>array[second]) {
					second =i;
				}
			}
			
			
			
		}
		System.out.println(second);
		
		
	}
