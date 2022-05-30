public class TestTaskObserver implements TaskObserver {

    @Override
    public void onComplete(){
        System.out.println("TestTaskObserver onComplete");
    }
}
