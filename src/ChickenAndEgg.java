public class ChickenAndEgg {
    public static void main(String[] args) {
        EggVoice mAnotherOpinion;
        mAnotherOpinion = new EggVoice();
        System.out.println("Что появилось первым: курица или яйцо? \nСпор начат:");
        mAnotherOpinion.start();
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
            }
            System.out.println("курица");
        }
        if(mAnotherOpinion.isAlive()) {
            try {
                mAnotherOpinion.join();
            }
            catch (InterruptedException e) {
            }
            System.out.println("Первым появилось яйцо!");
        } else {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор окончен!");
    }
}
class EggVoice extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            }
            catch (InterruptedException e) {
            }
            System.out.println("яйцо");
        }
    }
}