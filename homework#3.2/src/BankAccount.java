public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        return amount;
    }

    public void withDraw(int sum) {
        while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Запрашиваемая сумма больше чем сумма остатка " + amount, amount);
                } catch (LimitException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                } finally {
                    withDraw((int) amount);
                }
            }
            if (amount >= sum) {
                amount = (int) (amount - sum);
                System.out.println("Снято: " + sum);
                System.out.println("Осталось: " + amount);
                System.out.println(amount);
                System.out.println("----------------------");
            }
            if (amount == (double) 0) {
                break;
            }
        }
    }
}













































    /*     while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Запрашиваемая сумма на снятие больше чем остаток денег на счете:  " + amount, amount);
                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                    limitException.printStackTrace();
                } finally {
                    withDraw((int) amount);//double вернет в виде инта
                }
            }
            if (amount >= sum) {
                amount = (int) (amount - sum);//(int) - означает что он вернет в типе инта
                //System.out.println(amount);
                System.out.println("Снято: " + sum);
                System.out.println("Осталось на счете: " + amount);

                System.out.println("--------------");
            }
            if (amount == (double) 0) {
                break;
            }
        }
    }

}
*/

































   /* private double amount;


    public double getAmount() {
        return amount;
    }


    public double deposit(double sum) {
        amount = amount + sum;
        return amount;
    }


    public void withDraw(int sum) {
        while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Запрашиваемая сумма на снятие больше чем остаток денег на счете:  " + amount, amount);
                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                } finally {
                    withDraw((int) amount);
                }
            }
            if (amount >= sum) {
                amount = (int) (amount - sum);
                //System.out.println(amount);
                System.out.println("Снято: "+ sum );
                System.out.println("Осталось на счете: "+amount);

                System.out.println("--------------");
            }
            if (amount == (double) 0) {
                break;
            }
        }
    }
*/
