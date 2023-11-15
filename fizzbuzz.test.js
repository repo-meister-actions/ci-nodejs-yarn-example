const {isFizzNumber, isBuzzNumber, generate} = require("./fizzbuzz");

test('isFizzNumber', () => {
    expect(isFizzNumber(1)).toBeFalsy();
    expect(isFizzNumber(2)).toBeFalsy();
    expect(isFizzNumber(3)).toBeTruthy();
    expect(isFizzNumber(4)).toBeFalsy();
    expect(isFizzNumber(5)).toBeFalsy();
    expect(isFizzNumber(15)).toBeTruthy();
});

test('isBuzzNumber', () => {
    expect(isBuzzNumber(1)).toBeFalsy();
    expect(isBuzzNumber(2)).toBeFalsy();
    expect(isBuzzNumber(3)).toBeFalsy();
    expect(isBuzzNumber(4)).toBeFalsy();
    expect(isBuzzNumber(5)).toBeTruthy();
    expect(isBuzzNumber(15)).toBeTruthy();
});

test('generate', () => {
    let expected = "";
    expected += "1\n";
    expected += "2\n";
    expected += "Fizz\n";
    expected += "4\n";
    expected += "Buzz\n";
    expected += "Fizz\n";
    expected += "7\n";
    expected += "8\n";
    expected += "Fizz\n";
    expected += "Buzz\n";
    expected += "11\n";
    expected += "Fizz\n";
    expected += "13\n";
    expected += "14\n";
    expected += "FizzBuzz\n";

    const result = generate(15);

    expect(result).toBe(expected)
});
