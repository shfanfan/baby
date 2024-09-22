
public class Baby {

    private String name; //שם 
    private double[] height; // מערך מדידות גובה 
    private double[] weight; // מערך מדידות משקל

    public Baby(String name) {
        this.name = name;

        //creating the arrays
        weight = new double[12];
        height = new double[12];

        for (int i = 0; i < 12; i++) {
            height[i] = 0;
            weight[i] = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public double[] getHeight() {
        return this.height;
    }

    public double[] getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(int month, double height, double weight) {
        this.height[month-1] = height;
        this.weight[month-1] = weight;
    }

    public double getAvgWeight() {
        int weightSum = 0;
        int validWeight = 0;
        for (int i = 0; i < 12; i++) {
            if (weight[i] != 0) {
                validWeight++;
                weightSum += weight[i];
            }
        }
        return weightSum / validWeight;
    }

    public double getAvgHeight() {
        int heightSum = 0;
        int validHeight = 0;
        for (int i = 0; i < 12; i++) {
            if (height[i] != 0) {
                validHeight++;
                heightSum += height[i];
            }
        }
        return heightSum / validHeight;
    }

    public void getBMI() {
        double lastHeight = 0;
        double lastWeight = 0;

        for (int i = 12; i > 0; i++) {
            if (this.height[i] != 0) {
                lastHeight = this.height[i];
                lastWeight = this.weight[i];
            }
        }
        double lastBMI = (lastWeight / Math.pow(lastHeight, 2));
        System.out.println("BMI: " + lastBMI);
        //think: what if there are NO MEASURMENTS???

    }

    public int getValidMeasures() {
        int validHeight = 0;
        for (int i = 0; i < 12; i++) {
            if (height[i] != 0) {
                validHeight++;
            }
        }
        return validHeight;
    }

}
