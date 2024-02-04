package ch09.resolve14.resolve3;

public class DecisionBall {
    public void decision() {
        GeneratorThreeNum generatorThreeNum = new GeneratorThreeNum();
        int[] decision = generatorThreeNum.generatorNum();
        BaseBallMenu baseBallMenu = new BaseBallMenu();
        while(true) {
            int[] provide = baseBallMenu.viewMenu();

            int strikeCnt = 0;
            int ballCnt = 0;
            // 스트라이크 판단
            // 볼을 판단
            for (int i = 0; i < 3; i++) {
                if (decision[i] == provide[i]) {
                    strikeCnt++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        if (decision[i] == provide[j]) {
                            ballCnt++;
                        }
                    }
                }
            }
            System.out.println("==> " + strikeCnt+"스트라이크 "+ballCnt+"볼");

            if (strikeCnt == 3) {
                System.out.println("==> 삼진아웃!!");
                break;
            }
        }
    }
}
