/**
 * Created by Dave on 5/11/17.
 */
public class Tester {
    public static void main(String[] args) {
        double[][] trainingData = DataSetup.loadData("iris-training.csv");
        DataSetup.printData(trainingData);


        System.out.println("___________________________________________________");
        double[][] testingData = DataSetup.loadData("iris-testing.csv");
        DataSetup.printData(testingData);


        System.out.println("======================================================");
        Perceptron perceptron = new Perceptron(0.01, 5, trainingData, testingData);
        perceptron.train();
        perceptron.predict();
    }
}
