# DSA — Java Practice & Interview Preparation

A comprehensive collection of **Data Structures & Algorithms** implementations in Java, designed for interview preparation and algorithmic problem-solving practice. Whether you're brushing up on fundamentals or tackling complex problems, this repo provides well-organized, tested examples across all major DSA topics.

## 📋 Table of Contents
- [About](#about)
- [Repository Structure](#repository-structure)
- [What You'll Learn](#what-youll-learn)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)
- [Resources](#resources)

## About

This repository contains:
- **Foundational Concepts**: Arrays, ArrayList, Strings, and basic data structures
- **Searching & Sorting**: Linear search, binary search, bubble sort, selection sort, insertion sort, merge sort, quick sort
- **Advanced Structures**: Linked Lists, Stacks, Queues (including circular queues)
- **Algorithms**: Recursion, Backtracking, Dynamic Programming concepts
- **Problem Sets**: Real interview questions and pattern-matching exercises
- **Interview Resources**: Curated problem sets from Striver's A2Z Sheet and other popular sources

Perfect for:
- 👨‍💻 Interview preparation
- 📚 Learning DSA fundamentals
- 🎯 Competitive programming practice
- 🔍 Understanding algorithm implementations

## Repository Structure

```
DSA/
├── Java + DSA + Interview Preperation/     # Main topic-based exercises
│   ├── V12 arrayAndArrayList/              # Array and ArrayList fundamentals
│   ├── V13 linear search/                  # Linear search implementations
│   ├── V14 binary search/                  # Binary search variations
│   ├── V16 BinarySearchIn2D/               # 2D matrix search problems
│   ├── V17 bubblesort/                     # Bubble sort implementation
│   ├── V18 SelectionSort/                  # Selection sort
│   ├── V19 InsertionSort/                  # Insertion sort
│   ├── V20CycleSort/                       # Cycle sort
│   ├── V21String/                          # String operations and problems
│   ├── v22 recursion/                      # Recursion fundamentals
│   ├── V25 numbeersystem/                  # Number system problems
│   ├── V26 Mathsfordsa/                    # Mathematical concepts for DSA
│   ├── v28recursionquesonarray/            # Advanced recursion on arrays
│   ├── v30 mergequicksort/                 # Merge sort implementation
│   ├── v31 quicksort/                      # Quick sort implementation
│   ├── v35backtracking/                    # Backtracking algorithms (Maze, etc.)
│   ├── v37 ooops/                          # Java OOP concepts
│   ├── V44 linkedList/                     # Linked list operations
│   ├── V45 LL Ques/                        # Linked list problems
│   └── v46 stackAndQueue/                  # Stack and Queue implementations
├── Strivers A2Z Sheet/                     # Curated problem sets
│   └── BuildUpLogicalThinking/             # Pattern and logic building
└── README.md                               # This file
```

## What You'll Learn

| Topic | Files | Concepts |
|-------|-------|----------|
| **Arrays & Collections** | ArrayListDemo, MultiDimentionalArray | Dynamic arrays, 2D arrays, ArrayList API |
| **Searching** | LinearSearch, BinarySearch, RowColMatric | Time complexity, search optimization |
| **Sorting** | BubbleSort, SelectionSort, MergeSort, QuickSort | O(n²), O(n log n) algorithms |
| **Linked Lists** | LL1, LL2, RevLL1 | Node operations, reversal, traversal |
| **Stacks & Queues** | Stack, Queue, CircularQueue | LIFO/FIFO, dynamic implementations |
| **Recursion** | Recursion fundamentals, Backtracking | Base cases, tree recursion, MazeSolver |
| **OOP** | StaticLearn, WrapperExample | Java fundamentals for DSA |

## Prerequisites

- **Java Development Kit (JDK)**: Version 11 or higher
- **Text Editor/IDE**: VS Code, IntelliJ IDEA, or Eclipse
- **Basic Command Line**: Ability to compile and run Java programs
- **Git** (optional): For cloning and contributing

**Check your Java installation:**
```bash
java -version
javac -version
```

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/DSA.git
cd DSA
```

### 2. Compile and Run an Example

**Navigate to a specific topic and compile:**
```bash
cd "Java + DSA + Interview Preperation/V12 arrayAndArrayList"
javac ArrayListDemo.java
java ArrayListDemo
```

**Run with input/output redirection:**
```bash
javac "Strivers A2Z Sheet/BuildUpLogicalThinking/Pattern.java"
java Pattern < input.txt > output.txt
```

### 3. Using VS Code Tasks

If using VS Code, you can run the built-in `Compile and run` task:
- Open Command Palette: `Ctrl+Shift+P`
- Type: `Tasks: Run Task`
- Select: `Compile and run`

This will compile and execute the currently open Java file with input/output redirection.

### 4. Run All Examples

```bash
for file in **/*.java; do
  echo "Compiling $file..."
  javac "$file"
done
```

## Contributing

Contributions are **welcome and appreciated**! Whether you're fixing bugs, adding new solutions, or improving documentation, this is a community project.

### How to Contribute

1. **Fork the Repository**
   ```bash
   # Click "Fork" on the GitHub page
   ```

2. **Create a Feature Branch**
   ```bash
   git checkout -b feature/add-graph-algorithms
   git checkout -b fix/binary-search-edge-case
   ```

3. **Make Your Changes**
   - Write clean, well-commented code
   - Follow the existing folder structure
   - Add testable examples with sample input/output

4. **Test Your Code**
   ```bash
   javac YourNewAlgorithm.java
   java YourNewAlgorithm < test_input.txt
   ```

5. **Commit and Push**
   ```bash
   git add .
   git commit -m "Add: Graph BFS implementation with examples"
   git push origin feature/add-graph-algorithms
   ```

6. **Submit a Pull Request**
   - Provide a clear description of your changes
   - Reference any related issues
   - Include before/after examples if applicable

### Contribution Guidelines

- **Code Style**: Follow Java naming conventions (camelCase for variables/methods, PascalCase for classes)
- **Comments**: Add meaningful comments, especially for complex logic
- **Documentation**: Update this README if adding new major sections
- **Testing**: Ensure your code compiles and runs without errors
- **No large binary files**: Keep the repo lightweight
- **Avoid duplicates**: Check existing code before adding similar implementations

### Types of Contributions

- ✨ New algorithm implementations
- 🐛 Bug fixes and edge case handling
- 📚 Better documentation and examples
- 🎨 Code refactoring and improvements
- 📝 Problem explanations and comments
- 🔍 Test cases and input/output files
- 🚀 Performance optimizations

### Areas We Need Help With

- **Graph Algorithms** (BFS, DFS, Dijkstra, etc.)
- **Dynamic Programming** (detailed implementations)
- **Advanced Data Structures** (Trees, Heaps, Tries)
- **LeetCode/HackerRank Problem Solutions**
- **Documentation** (algorithm explanations, complexity analysis)

## License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

You are free to use, modify, and distribute this code for educational and commercial purposes.

## Resources

### Learning Platforms
- [LeetCode](https://leetcode.com/) - Practice problems
- [HackerRank](https://www.hackerrank.com/) - Structured DSA learning
- [GeeksforGeeks](https://www.geeksforgeeks.org/) - DSA tutorials and articles
- [Striver's DSA Course](https://takeuforward.org/) - Comprehensive DSA guidance

### Reference Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Big-O Complexity Cheat Sheet](https://www.bigocheatsheet.com/)
- [Algorithm Visualizations](https://visualgo.net/) - See algorithms in action

### Interview Prep
- [Blind 75 LeetCode Questions](https://leetcode.com/discuss/general-discussion/460599/)
- [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-sheet/overview/)
- [InterviewBit](https://www.interviewbit.com/) - Curated interview questions

---

## Questions or Issues?

- 📧 **Found a bug?** Open an [issue](https://github.com/your-username/DSA/issues)
- 💡 **Have a suggestion?** Start a [discussion](https://github.com/your-username/DSA/discussions)
- 🤝 **Want to help?** See the [Contributing](#contributing) section

---

**Happy Learning! 🚀**

*Last updated: February 2026 | Maintained by the DSA community*
