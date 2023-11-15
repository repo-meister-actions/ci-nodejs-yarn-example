function isFizzNumber(n) {
    return n % 3 === 0;
}

function isBuzzNumber(n) {
    return n % 5 === 0;
}

function generate(count) {
    let result = '';
    for (let i = 1; i <= count; i++) {
        if (isFizzNumber(i) && isBuzzNumber(i)) {
            result += 'FizzBuzz\n';
        } else if (isFizzNumber(i)) {
            result += 'Fizz\n';
        } else if (isBuzzNumber(i)) {
            result += 'Buzz\n';
        } else {
            result += `${i}\n`;
        }
    }
    return result;
}

module.exports = {
    isFizzNumber: isFizzNumber,
    isBuzzNumber: isBuzzNumber,
    generate: generate,
}