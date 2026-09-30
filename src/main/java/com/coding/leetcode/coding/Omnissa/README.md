# Omnissa interview practice

Java 17-compatible starter exercises. Implement the methods yourself: no problem solutions are supplied.

## Getting started

1. Open a class in your IDE. Start with `dsa/arrays/ArrayRotationByKPosition.java`.
2. Read its problem statement, input contract and expected example output.
3. Replace the `throw new UnsupportedOperationException("TODO: ...")` in a solution method with your code.
4. Run the class's `main(String[] args)` to print input, expected output and your actual output.
5. Add more examples and record your time/space complexity in the comments.

The exception is a compilable placeholder, not a solution. Java methods with return values cannot have a completely empty body. The sample runner displays `NOT IMPLEMENTED` until you replace it. It displays results for manual comparison; it is not an automatic correctness grader. Returning null for a successful void exercise may simply mean completion; check its stated observable result.

Some exercises provide separate brute-force/improved methods; others provide one main method or a stateful API. Implement the approach you want to practice. For concurrency labs, the orchestration method is also yours to implement: create workers there, enforce a deadline and clean them up. The starter mains themselves do not launch incomplete worker threads.

The capitalized `Omnissa` package segment matches the requested folder name. Existing project classes and build settings are unchanged.

## Topic structure

- `dsa/`: numbered D01-D26 tasks and all named additional DSA practice topics, including P0 trees.
- `corejava/`: concrete coding labs corresponding to J01-J24.
- `concurrency/`: C01-C07 practical labs and exercises covering T01-T26. Related theory IDs share a lab where appropriate.
- `support/`: input-node fixtures and output formatting only.

P0 means first priority, P1 means next, and P2 means optional breadth. A converted theory lab is a practice extension, not a claim that the exact exercise was reported by an Omnissa candidate. D13, D18, D24 and D25 had incomplete original prompts; their chosen practice contracts are explicitly labeled. D09 and D15 have multiple classes for distinct variants.

The virtual-thread extension is deliberately a Java 17-compilable stub. Actual virtual-thread APIs require Java 21 or later; do not change this project's toolchain just to compile the starter pack.

## Run without Spring or Gradle

From the `Omnissa` directory, compile into a temporary output folder outside the source tree:

```sh
find . -name '*.java' > /tmp/omnissa-sources.txt
javac --release 17 -d /tmp/omnissa-practice @/tmp/omnissa-sources.txt
java -cp /tmp/omnissa-practice com.coding.leetcode.coding.Omnissa.dsa.arrays.ArrayRotationByKPosition
```

No extra libraries or changes to Gradle are required. The pack was compiled independently because other folders contain your existing practice work.

## Exercise index

104 exercise classes: 63 DSA, 24 core Java, 17 concurrency. Three shared support classes.


### concurrency

| IDs | Priority | Class |
|---|---|---|
| C03, T07, T16, T24 | P0, P1 | [BoundedProducerConsumerQueue](concurrency/BoundedProducerConsumerQueue.java) |
| C05, T04, T08 | P0 | [ConcurrentInventoryReservation](concurrency/ConcurrentInventoryReservation.java) |
| C07, T02, T03 | P0, P1 | [ConcurrentLatencyMonitor](concurrency/ConcurrentLatencyMonitor.java) |
| C06, T13, T14, T15, T18, T19, T22 | P0, P1 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T17 | P0 | [CoordinatedBatchProcessing](concurrency/CoordinatedBatchProcessing.java) |
| T11 | P0 | [DeadlockFreeTransfers](concurrency/DeadlockFreeTransfers.java) |
| T26 | P2 | [FalseSharingMeasurement](concurrency/FalseSharingMeasurement.java) |
| T26 | P2 | [ForkJoinArraySum](concurrency/ForkJoinArraySum.java) |
| C01, T05, T06 | P0 | [OddEvenPrinter](concurrency/OddEvenPrinter.java) |
| C02, T23 | P0, P1 | [PriorityFifoScheduler](concurrency/PriorityFifoScheduler.java) |
| T20 | P1 | [RequestContextIsolation](concurrency/RequestContextIsolation.java) |
| T12 | P0 | [SafeConfigurationPublication](concurrency/SafeConfigurationPublication.java) |
| T26 | P2 | [StampedPointSnapshot](concurrency/StampedPointSnapshot.java) |
| T01 | P0 | [ThreadLifecycleFoundations](concurrency/ThreadLifecycleFoundations.java) |
| C04, T09, T10, T21 | P0, P1 | [ThreadSafeLruCache](concurrency/ThreadSafeLruCache.java) |
| T26 | P2 | [VersionedCasUpdate](concurrency/VersionedCasUpdate.java) |
| T25 | P2 | [VirtualThreadsExtension](concurrency/VirtualThreadsExtension.java) |

### corejava

| IDs | Priority | Class |
|---|---|---|
| J01 | P0 | [J01EqualityLab](corejava/J01EqualityLab.java) |
| J02 | P0 | [J02HashMapLab](corejava/J02HashMapLab.java) |
| J03 | P0 | [J03CollectionsLab](corejava/J03CollectionsLab.java) |
| J04 | P0 | [J04IterationLab](corejava/J04IterationLab.java) |
| J05 | P0 | [J05OopLab](corejava/J05OopLab.java) |
| J06 | P0 | [J06ImmutabilityLab](corejava/J06ImmutabilityLab.java) |
| J07 | P0 | [J07StringsLab](corejava/J07StringsLab.java) |
| J08 | P0 | [J08GenericsLab](corejava/J08GenericsLab.java) |
| J09 | P0 | [J09ExceptionsLab](corejava/J09ExceptionsLab.java) |
| J10 | P0 | [J10LanguageTrapsLab](corejava/J10LanguageTrapsLab.java) |
| J11 | P0 | [J11StreamsLab](corejava/J11StreamsLab.java) |
| J12 | P0 | [J12CollectorsLab](corejava/J12CollectorsLab.java) |
| J13 | P0 | [J13OptionalLab](corejava/J13OptionalLab.java) |
| J14 | P0 | [J14ComparatorsLab](corejava/J14ComparatorsLab.java) |
| J15 | P0 | [J15RegexLab](corejava/J15RegexLab.java) |
| J16 | P1 | [J16JvmMemoryLab](corejava/J16JvmMemoryLab.java) |
| J17 | P1 | [J17GcAnalysisLab](corejava/J17GcAnalysisLab.java) |
| J18 | P1 | [J18ClassLoadingLab](corejava/J18ClassLoadingLab.java) |
| J19 | P1 | [J19DiagnosticsLab](corejava/J19DiagnosticsLab.java) |
| J20 | P1 | [J20TestingLab](corejava/J20TestingLab.java) |
| J21 | P1 | [J21PatternsLab](corejava/J21PatternsLab.java) |
| J22 | P1 | [J22DateAndResourcesLab](corejava/J22DateAndResourcesLab.java) |
| J23 | P2 | [J23SerializationReflectionLab](corejava/J23SerializationReflectionLab.java) |
| J24 | P2 | [J24ModernJavaLab](corejava/J24ModernJavaLab.java) |

### dsa/arrays

| IDs | Priority | Class |
|---|---|---|
| D01 | P0 | [ArrayRotationByKPosition](dsa/arrays/ArrayRotationByKPosition.java) |
| D04 | P0 | [FirstDuplicateElement](dsa/arrays/FirstDuplicateElement.java) |
| D21 | P2 | [MaximumSubarray](dsa/arrays/MaximumSubarray.java) |
| Additional practice | P1 | [MergeSortedArrays](dsa/arrays/MergeSortedArrays.java) |
| Additional practice | P2 | [SlidingWindowMaximum](dsa/arrays/SlidingWindowMaximum.java) |
| D08 | P0 | [SortedSquares](dsa/arrays/SortedSquares.java) |
| D26 | P1 | [ThreeSum](dsa/arrays/ThreeSum.java) |

### dsa/backtracking

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P2 | [Permutations](dsa/backtracking/Permutations.java) |
| Additional practice | P2 | [Subsets](dsa/backtracking/Subsets.java) |

### dsa/binarysearch

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [BinarySearchBoundaries](dsa/binarysearch/BinarySearchBoundaries.java) |
| Additional practice | P1 | [SearchInRotatedSortedArray](dsa/binarysearch/SearchInRotatedSortedArray.java) |

### dsa/design

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [LruCache](dsa/design/LruCache.java) |
| Additional practice | P2 | [TriePrefixSearch](dsa/design/TriePrefixSearch.java) |

### dsa/dp

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P2 | [ClimbingStairs](dsa/dp/ClimbingStairs.java) |
| D14 | P1 | [CoinChange](dsa/dp/CoinChange.java) |
| Additional practice | P2 | [HouseRobber](dsa/dp/HouseRobber.java) |
| Additional practice | P2 | [LongestIncreasingSubsequence](dsa/dp/LongestIncreasingSubsequence.java) |
| D24 | P2 | [MaximalAllOnesSquare](dsa/dp/MaximalAllOnesSquare.java) |
| Additional practice | P2 | [ZeroOneKnapsack](dsa/dp/ZeroOneKnapsack.java) |

### dsa/graphs

| IDs | Priority | Class |
|---|---|---|
| D23 | P2 | [CelebrityProblem](dsa/graphs/CelebrityProblem.java) |
| Additional practice | P1 | [ConnectedComponents](dsa/graphs/ConnectedComponents.java) |
| D03 | P0 | [CourseScheduleII](dsa/graphs/CourseScheduleII.java) |
| Additional practice | P1 | [DirectedCycleDetection](dsa/graphs/DirectedCycleDetection.java) |
| Additional practice | P1 | [FloodFill](dsa/graphs/FloodFill.java) |
| Additional practice | P1 | [GraphTraversals](dsa/graphs/GraphTraversals.java) |
| Additional practice | P2 | [ShortestPaths](dsa/graphs/ShortestPaths.java) |
| Additional practice | P2 | [UnionFind](dsa/graphs/UnionFind.java) |

### dsa/hashing

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [FirstUniqueCharacter](dsa/hashing/FirstUniqueCharacter.java) |
| Additional practice | P1 | [GroupAnagrams](dsa/hashing/GroupAnagrams.java) |
| Additional practice | P1 | [SubarraySumEqualsK](dsa/hashing/SubarraySumEqualsK.java) |
| Additional practice | P1 | [TwoSum](dsa/hashing/TwoSum.java) |

### dsa/heaps

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [KthLargestElement](dsa/heaps/KthLargestElement.java) |
| Additional practice | P1 | [MergeKSortedLinkedLists](dsa/heaps/MergeKSortedLinkedLists.java) |
| Additional practice | P1 | [RunningMedian](dsa/heaps/RunningMedian.java) |
| D15 | P1 | [TopKFrequentElements](dsa/heaps/TopKFrequentElements.java) |
| D16 | P1 | [TopKFrequentIpAddresses](dsa/heaps/TopKFrequentIpAddresses.java) |
| D15 | P1 | [TopKLargestElements](dsa/heaps/TopKLargestElements.java) |

### dsa/intervals

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [MeetingRoomOverlap](dsa/intervals/MeetingRoomOverlap.java) |
| Additional practice | P1 | [MergeIntervals](dsa/intervals/MergeIntervals.java) |

### dsa/linkedlists

| IDs | Priority | Class |
|---|---|---|
| Additional practice | P1 | [LinkedListCycleDetection](dsa/linkedlists/LinkedListCycleDetection.java) |
| Additional practice | P1 | [MergeTwoSortedLinkedLists](dsa/linkedlists/MergeTwoSortedLinkedLists.java) |
| D22 | P2 | [PalindromeLinkedList](dsa/linkedlists/PalindromeLinkedList.java) |
| Additional practice | P1 | [RemoveNthNodeFromEnd](dsa/linkedlists/RemoveNthNodeFromEnd.java) |
| D07 | P0 | [ReverseLinkedList](dsa/linkedlists/ReverseLinkedList.java) |

### dsa/practical

| IDs | Priority | Class |
|---|---|---|
| D12 | P0 | [ApiLatencyClassifier](dsa/practical/ApiLatencyClassifier.java) |
| D25 | P2 | [MinimumDebtSettlementTransactions](dsa/practical/MinimumDebtSettlementTransactions.java) |
| D20 | P1 | [NewsFeedSubscriptions](dsa/practical/NewsFeedSubscriptions.java) |
| D19 | P1 | [ProductCatalogService](dsa/practical/ProductCatalogService.java) |

### dsa/stacksqueues

| IDs | Priority | Class |
|---|---|---|
| D09 | P0 | [ArrayStack](dsa/stacksqueues/ArrayStack.java) |
| D05 | P0 | [BalancedParentheses](dsa/stacksqueues/BalancedParentheses.java) |
| Additional practice | P1 | [MinStack](dsa/stacksqueues/MinStack.java) |
| D10 | P0 | [QueueUsingStacks](dsa/stacksqueues/QueueUsingStacks.java) |
| D09 | P0 | [StackUsingQueues](dsa/stacksqueues/StackUsingQueues.java) |

### dsa/strings

| IDs | Priority | Class |
|---|---|---|
| D02 | P0 | [LongestSubstringWithoutRepeatingCharacters](dsa/strings/LongestSubstringWithoutRepeatingCharacters.java) |
| D17 | P1 | [ReduceRepeatedRunsByOne](dsa/strings/ReduceRepeatedRunsByOne.java) |
| D13 | P0 | [RegexLibraryPractice](dsa/strings/RegexLibraryPractice.java) |
| D06 | P0 | [RemoveAdjacentDuplicates](dsa/strings/RemoveAdjacentDuplicates.java) |
| D11 | P0 | [SumDigitsInString](dsa/strings/SumDigitsInString.java) |

### dsa/trees

| IDs | Priority | Class |
|---|---|---|
| D18 | P0 | [BinaryTreeLevelOrderTraversal](dsa/trees/BinaryTreeLevelOrderTraversal.java) |
| D18 | P0 | [BinaryTreeTraversals](dsa/trees/BinaryTreeTraversals.java) |
| D18 | P0 | [LowestCommonAncestor](dsa/trees/LowestCommonAncestor.java) |
| D18 | P0 | [MaximumDepthOfBinaryTree](dsa/trees/MaximumDepthOfBinaryTree.java) |
| D18 | P0 | [ValidateBinarySearchTree](dsa/trees/ValidateBinarySearchTree.java) |

## Coverage by question ID

| ID | Classes |
|---|---|
| C01 | [OddEvenPrinter](concurrency/OddEvenPrinter.java) |
| C02 | [PriorityFifoScheduler](concurrency/PriorityFifoScheduler.java) |
| C03 | [BoundedProducerConsumerQueue](concurrency/BoundedProducerConsumerQueue.java) |
| C04 | [ThreadSafeLruCache](concurrency/ThreadSafeLruCache.java) |
| C05 | [ConcurrentInventoryReservation](concurrency/ConcurrentInventoryReservation.java) |
| C06 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| C07 | [ConcurrentLatencyMonitor](concurrency/ConcurrentLatencyMonitor.java) |
| D01 | [ArrayRotationByKPosition](dsa/arrays/ArrayRotationByKPosition.java) |
| D02 | [LongestSubstringWithoutRepeatingCharacters](dsa/strings/LongestSubstringWithoutRepeatingCharacters.java) |
| D03 | [CourseScheduleII](dsa/graphs/CourseScheduleII.java) |
| D04 | [FirstDuplicateElement](dsa/arrays/FirstDuplicateElement.java) |
| D05 | [BalancedParentheses](dsa/stacksqueues/BalancedParentheses.java) |
| D06 | [RemoveAdjacentDuplicates](dsa/strings/RemoveAdjacentDuplicates.java) |
| D07 | [ReverseLinkedList](dsa/linkedlists/ReverseLinkedList.java) |
| D08 | [SortedSquares](dsa/arrays/SortedSquares.java) |
| D09 | [ArrayStack](dsa/stacksqueues/ArrayStack.java), [StackUsingQueues](dsa/stacksqueues/StackUsingQueues.java) |
| D10 | [QueueUsingStacks](dsa/stacksqueues/QueueUsingStacks.java) |
| D11 | [SumDigitsInString](dsa/strings/SumDigitsInString.java) |
| D12 | [ApiLatencyClassifier](dsa/practical/ApiLatencyClassifier.java) |
| D13 | [RegexLibraryPractice](dsa/strings/RegexLibraryPractice.java) |
| D14 | [CoinChange](dsa/dp/CoinChange.java) |
| D15 | [TopKFrequentElements](dsa/heaps/TopKFrequentElements.java), [TopKLargestElements](dsa/heaps/TopKLargestElements.java) |
| D16 | [TopKFrequentIpAddresses](dsa/heaps/TopKFrequentIpAddresses.java) |
| D17 | [ReduceRepeatedRunsByOne](dsa/strings/ReduceRepeatedRunsByOne.java) |
| D18 | [BinaryTreeLevelOrderTraversal](dsa/trees/BinaryTreeLevelOrderTraversal.java), [BinaryTreeTraversals](dsa/trees/BinaryTreeTraversals.java), [LowestCommonAncestor](dsa/trees/LowestCommonAncestor.java), [MaximumDepthOfBinaryTree](dsa/trees/MaximumDepthOfBinaryTree.java), [ValidateBinarySearchTree](dsa/trees/ValidateBinarySearchTree.java) |
| D19 | [ProductCatalogService](dsa/practical/ProductCatalogService.java) |
| D20 | [NewsFeedSubscriptions](dsa/practical/NewsFeedSubscriptions.java) |
| D21 | [MaximumSubarray](dsa/arrays/MaximumSubarray.java) |
| D22 | [PalindromeLinkedList](dsa/linkedlists/PalindromeLinkedList.java) |
| D23 | [CelebrityProblem](dsa/graphs/CelebrityProblem.java) |
| D24 | [MaximalAllOnesSquare](dsa/dp/MaximalAllOnesSquare.java) |
| D25 | [MinimumDebtSettlementTransactions](dsa/practical/MinimumDebtSettlementTransactions.java) |
| D26 | [ThreeSum](dsa/arrays/ThreeSum.java) |
| J01 | [J01EqualityLab](corejava/J01EqualityLab.java) |
| J02 | [J02HashMapLab](corejava/J02HashMapLab.java) |
| J03 | [J03CollectionsLab](corejava/J03CollectionsLab.java) |
| J04 | [J04IterationLab](corejava/J04IterationLab.java) |
| J05 | [J05OopLab](corejava/J05OopLab.java) |
| J06 | [J06ImmutabilityLab](corejava/J06ImmutabilityLab.java) |
| J07 | [J07StringsLab](corejava/J07StringsLab.java) |
| J08 | [J08GenericsLab](corejava/J08GenericsLab.java) |
| J09 | [J09ExceptionsLab](corejava/J09ExceptionsLab.java) |
| J10 | [J10LanguageTrapsLab](corejava/J10LanguageTrapsLab.java) |
| J11 | [J11StreamsLab](corejava/J11StreamsLab.java) |
| J12 | [J12CollectorsLab](corejava/J12CollectorsLab.java) |
| J13 | [J13OptionalLab](corejava/J13OptionalLab.java) |
| J14 | [J14ComparatorsLab](corejava/J14ComparatorsLab.java) |
| J15 | [J15RegexLab](corejava/J15RegexLab.java) |
| J16 | [J16JvmMemoryLab](corejava/J16JvmMemoryLab.java) |
| J17 | [J17GcAnalysisLab](corejava/J17GcAnalysisLab.java) |
| J18 | [J18ClassLoadingLab](corejava/J18ClassLoadingLab.java) |
| J19 | [J19DiagnosticsLab](corejava/J19DiagnosticsLab.java) |
| J20 | [J20TestingLab](corejava/J20TestingLab.java) |
| J21 | [J21PatternsLab](corejava/J21PatternsLab.java) |
| J22 | [J22DateAndResourcesLab](corejava/J22DateAndResourcesLab.java) |
| J23 | [J23SerializationReflectionLab](corejava/J23SerializationReflectionLab.java) |
| J24 | [J24ModernJavaLab](corejava/J24ModernJavaLab.java) |
| T01 | [ThreadLifecycleFoundations](concurrency/ThreadLifecycleFoundations.java) |
| T02 | [ConcurrentLatencyMonitor](concurrency/ConcurrentLatencyMonitor.java) |
| T03 | [ConcurrentLatencyMonitor](concurrency/ConcurrentLatencyMonitor.java) |
| T04 | [ConcurrentInventoryReservation](concurrency/ConcurrentInventoryReservation.java) |
| T05 | [OddEvenPrinter](concurrency/OddEvenPrinter.java) |
| T06 | [OddEvenPrinter](concurrency/OddEvenPrinter.java) |
| T07 | [BoundedProducerConsumerQueue](concurrency/BoundedProducerConsumerQueue.java) |
| T08 | [ConcurrentInventoryReservation](concurrency/ConcurrentInventoryReservation.java) |
| T09 | [ThreadSafeLruCache](concurrency/ThreadSafeLruCache.java) |
| T10 | [ThreadSafeLruCache](concurrency/ThreadSafeLruCache.java) |
| T11 | [DeadlockFreeTransfers](concurrency/DeadlockFreeTransfers.java) |
| T12 | [SafeConfigurationPublication](concurrency/SafeConfigurationPublication.java) |
| T13 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T14 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T15 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T16 | [BoundedProducerConsumerQueue](concurrency/BoundedProducerConsumerQueue.java) |
| T17 | [CoordinatedBatchProcessing](concurrency/CoordinatedBatchProcessing.java) |
| T18 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T19 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T20 | [RequestContextIsolation](concurrency/RequestContextIsolation.java) |
| T21 | [ThreadSafeLruCache](concurrency/ThreadSafeLruCache.java) |
| T22 | [ConcurrentServiceAggregator](concurrency/ConcurrentServiceAggregator.java) |
| T23 | [PriorityFifoScheduler](concurrency/PriorityFifoScheduler.java) |
| T24 | [BoundedProducerConsumerQueue](concurrency/BoundedProducerConsumerQueue.java) |
| T25 | [VirtualThreadsExtension](concurrency/VirtualThreadsExtension.java) |
| T26 | [FalseSharingMeasurement](concurrency/FalseSharingMeasurement.java), [ForkJoinArraySum](concurrency/ForkJoinArraySum.java), [StampedPointSnapshot](concurrency/StampedPointSnapshot.java), [VersionedCasUpdate](concurrency/VersionedCasUpdate.java) |
