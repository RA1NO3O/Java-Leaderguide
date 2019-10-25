package aug27th;
class Storage{
    private int[] cells=new int[10];
    private int inPos,outPos;
    private int count;
    public synchronized void put(int num){
        try{
            while(count==cells.length){
                this.wait();
            }
            cells[inPos]=num;
            System.out.printf("在cells[%d]中放入数据---%d\n",inPos,cells[inPos]);
            inPos++;
            if(inPos==9)
                inPos=0;
            count++;
            this.notify();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void get(){
        try{
            while(count==0){
                this.wait();
            }
            int data=cells[outPos];
            System.out.printf("从cells[%d]中取出数据---%d\n",outPos,data);
            cells[outPos]=0;
            outPos++;
            if(outPos==9);
                outPos=0;
            count--;
            this.notify();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}