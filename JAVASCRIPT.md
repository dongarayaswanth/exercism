1. JavaScript has a built-in ... operator that makes it easier to work with indefinite numbers of elements.
2. When ... appears on the left-hand side of an assignment, those three dots are known as the rest operator. The three dots together with a variable name is called a rest element. It collects zero or more values, and stores them into a single array.
3. Rest properties
Similarly to arrays, the rest operator can also be used to collect one or more object properties and store them in a single object.
```
const { street, ...address } = {
  street: 'Platz der Republik 1',
  postalCode: '11011',
  city: 'Berlin',
};
street;
// => 'Platz der Republik 1'
address;
// => {postalCode: '11011', city: 'Berlin'}
```
4. When ... appears in a function definition next to its last argument, that parameter is called a rest parameter. It allows the function to accept an indefinite number of arguments as an array.
```
function concat(...strings) {
  return strings.join(' ');
}
concat('one');
// => 'one'
concat('one', 'two', 'three');
// => 'one two three'
```
5. Spread elements
When ... appears on the right-hand side of an assignment, it's known as the spread operator. It expands an array into a list of elements. Unlike the rest element, it can appear anywhere in an array literal expression, and there can be more than one.
```
const oneToFive = [1, 2, 3, 4, 5];
const oneToTen = [...oneToFive, 6, 7, 8, 9, 10];
oneToTen;
// => [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
const woow = ['A', ...oneToFive, 'B', 'C', 'D', 'E', ...oneToFive, 42];
woow;
// =>  ["A", 1, 2, 3, 4, 5, "B", "C", "D", "E", 1, 2, 3, 4, 5, 42]
```
