class Cashflow {
    String _name;
    int _money;

    Cashflow(String name, int money) {
        _name = name;
        _money = money;
    }

    void payout(int money) {
        if (_money < money) {
            System.out.println("所持金" + _money + "円、代金" + money + "円 → 残金不足で購入不可です。");
        } else {
            _money = _money - money;
        }
    }

    void income(int money) {
        _money = _money + money;
    }

    void summary() {
        System.out.println(_name + "さんの今月の収支は" + _money + "円です。");
    }
}


class Result {
    public static void main(String[] args) {
        Cashflow cf = new Cashflow("井坂", 100000000);

        cf.income(1000);
        cf.income(100000);
        cf.payout(1000000000);

        cf.payout(1000);
        
        cf.summary();
    }
}

