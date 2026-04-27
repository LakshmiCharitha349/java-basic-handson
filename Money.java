// Money.java

class Money {
final int value;

   Money(int amount) {
     this.value = amount;
  }

  Money add(Money rupees) {
    int total = this.value + rupees.value;
    return new Money(total);

  }

  Money minus(Money rupees) {
    int total = this.value - rupees.value;
    return new Money(total);
  }
}