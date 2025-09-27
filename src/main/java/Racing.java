public class Racing {
    String leader="";
    int distance;
    int topDistance=0;


    public void updateLeader(Cars car){
        distance=car.speed*24;
        if (distance>topDistance){
            topDistance=distance;
            leader= car.name;
        }
        System.out.println(car.name);
    }

}
