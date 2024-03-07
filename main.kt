fun main() {
  for (num in 1 .. 100) {
    when {
      num % 15 == 0 -> println("FizzBuzz");
      num % 5 == 0 -> println("Fizz");
      num % 3 == 0 -> println("Buzz");
      else -> println(num);
    }
  }
}
