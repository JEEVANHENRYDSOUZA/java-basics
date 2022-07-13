public class binarysearch {
    static void binarysearchrepeated(int array[],int key){
        int ans=0;
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==key){
              ans=mid;
              right=mid-1;
              
                

            }
            else if(array[mid]<key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(ans);
        return;


    }
    public static void main(String[] args){


        System.out.println("binary search");

        //conditions for binary search array should be sorted
        //time complexity o(log(n))
        //two variations of it 
        //1.recursive
        //2.iterative
        //very important for interviews
        //problems should have terms such as key,value,sorted
        //psuedo code
        //find mid
        //take two pointers left and right
        //left should be equal to the first element in the array
        //right should be equal to the last element in the array
        //return -1 when element is not found
        //iterate till left is less than right
        //if we have not found then the value which the left points to it is the first closest element to the key which we are looking for
        //calculate mid-value as l+(r-1)/2
        //coding binary search
        int array[]={1,1,2,2,3,3,3,4,4,4,5,5,5,6};
        binarysearchrepeated(array,4);

  //first occurance of the element will be on the left hand side in repeated elements array
      //last occurance will be on the right hand side in the repeated array



    }




}
