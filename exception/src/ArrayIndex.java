class OverException extends Throwable{
}
class OverException_two extends Throwable{
}
public class ArrayIndex {
    public static void readline() throws OverException,OverException_two{
        //定义时必须throws OverException(这样做是为了提醒readline方法可能会抛出异常),否则报错
        if(2==-1){
            throw new OverException();//自定义时刻抛出自定义异常
        }
    }
    public static void main(String[] args){
        try{
            readline();
            System.out.println("1");
        }
        catch(OverException aaa){
            System.out.println("2");
        }
        catch(OverException_two bbb){
            System.out.println("3");
        }
        catch(Exception bbb){//Exception代表任何异常
            System.out.println("3");
        }
    }
}
