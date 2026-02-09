public class DynamicStack extends stack{ 
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    //only need to implement new push method so override it 
    @Override
    public boolean push(int item){
        if(isFull()){
            //create new array with double size 
            int[] newdata = new int[data.length * 2];
            //copy the old items in new array 
            for(int i=0;i<data.length;i++){
                newdata[i] = data[i];
            }
            //point data to new array 
            data = newdata;
        }
        //now push the item 
        return super.push(item);
    }

    public static void main(String[] args) {
        
    }
}
