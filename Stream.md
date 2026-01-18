# Stream API

Source: https://dev.java/learn/api/streams/

Table of contents:
- [Stream API](#stream-api)
  - [Processing Data in Memory Using the Stream API](#processing-data-in-memory-using-the-stream-api)
  - [Adding Intermediate Operations on a Stream](#adding-intermediate-operations-on-a-stream)

## Processing Data in Memory Using the Stream API

In Java, **Collections** are about **storage** (data), while **Streams** are about **computation** (process). 

| Feature     | Collections                            | Stream API                                            |
| ----------- | -------------------------------------- | ----------------------------------------------------- |
| Purpose     | Storage and management of data         | Computation and transformation of data                |
| Execution   | Eager: Operations happen immediately   | Lazy: Operations happen only when needed              |
| Memory      | All elements are held in memory        | Does not store elements; processes them from a source |
| Reusability | Can be traversed multiple times        | Consumable: Can be traversed only once                |
| Iteration   | External: Use `for-each` or `Iterator` | Internal: The Stream handles the "how" of iteration   |

There are three specialized interfaces to handle streams of numbers: `IntStream`, `LongStream`, and `DoubleStream`. Because they are handling numbers, they have some terminal operations that do not exist in `Stream`:
- `sum()`: to compute the sum
- `min()`, `max()`: to compute the minimum or the maximum number of a stream
- `average`: to compute the average value of the numbers
- `summaryStatistics()`: this call produces a special object that carries several statistics, all computed on one pass over the data

Only one method allowed to call on a stream. It is useless to store streams in fields or local variables. A stream should be created and consumed on the spot. A stream should not have any side effects.

## Adding Intermediate Operations on a Stream