# Contributing to DSA Repository

Thank you for your interest in contributing! We welcome contributions from everyone, regardless of experience level.

## Code of Conduct

Please note that this project is governed by a [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you agree to uphold this code.

## Ways to Contribute

### 1. **Report Bugs**
Found a bug? Help us improve!
- Check if the issue already exists in [Issues](https://github.com/your-username/DSA/issues)
- Provide a clear description of the bug
- Include steps to reproduce
- Mention your Java version and OS

### 2. **Add New Implementations**
Missing an algorithm? Implement it!
- Pick from our [Issues](https://github.com/your-username/DSA/issues) or suggest your own
- Follow the existing code structure and naming conventions
- Add meaningful comments and documentation
- Include test cases or example input/output

### 3. **Improve Documentation**
- Fix typos and grammatical errors
- Add algorithm explanations and complexity analysis
- Create better examples or tutorials
- Translate documentation to other languages

### 4. **Fix and Refactor**
- Improve code efficiency
- Clean up outdated code
- Enhance readability
- Optimize for performance

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Git
- GitHub account

### Step-by-Step Contribution Guide

#### 1. Fork the Repository
Click the "Fork" button at the top right of the [repository page](https://github.com/your-username/DSA).

#### 2. Clone Your Fork
```bash
git clone https://github.com/YOUR-USERNAME/DSA.git
cd DSA
```

#### 3. Create a Branch
Use a descriptive branch name:
```bash
# For new features
git checkout -b feature/add-graph-bfs

# For bug fixes
git checkout -b fix/binary-search-edge-case

# For documentation
git checkout -b docs/improve-readme
```

#### 4. Make Your Changes
- Write clean, readable code
- Follow Java conventions (see [Code Style Guide](#code-style-guide) below)
- Add comments for complex logic
- Test thoroughly before committing

#### 5. Commit Your Changes
```bash
git add .
git commit -m "Add: BFS implementation for graph traversal

- Implements breadth-first search algorithm
- Includes queue-based traversal
- Added test cases with sample input/output
- Time complexity: O(V + E) where V=vertices, E=edges"
```

**Commit message format:**
- Use the format: `Type: Brief description`
- Types: `Add`, `Fix`, `Improve`, `Refactor`, `Docs`, `Test`
- Keep the first line under 50 characters
- Provide detailed explanation in the body if needed

#### 6. Push to Your Fork
```bash
git push origin feature/add-graph-bfs
```

#### 7. Create a Pull Request
1. Go to your fork on GitHub
2. Click "Compare & pull request"
3. Write a clear PR title and description
4. Reference any related issues (e.g., `Closes #42`)
5. Submit the PR

#### 8. Respond to Feedback
- Be open to reviews and feedback
- Make requested changes and push them
- Discuss any disagreements respectfully

## Code Style Guide

### Java Naming Conventions
```java
// Classes: PascalCase
public class BinarySearchTree { }

// Methods & Variables: camelCase
public int searchElement(int target) { }
private int nodeCount;

// Constants: UPPER_SNAKE_CASE
public static final int MAX_SIZE = 1000;
```

### Code Structure
```java
public class AlgorithmName {
    
    // Class-level constants first
    private static final int BUFFER_SIZE = 100;
    
    // Member variables
    private int[] arr;
    private int size;
    
    // Constructor
    public AlgorithmName(int[] input) {
        this.arr = input;
        this.size = input.length;
    }
    
    // Public methods
    public void solve() {
        // Main algorithm logic
    }
    
    // Helper methods
    private void helper() {
        // Supporting logic
    }
}
```

### Comments and Documentation
```java
/**
 * Performs binary search on a sorted array.
 * 
 * @param arr the sorted array to search in
 * @param target the element to find
 * @return index of target if found, -1 otherwise
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public int binarySearch(int[] arr, int target) {
    // Implementation here
}
```

### Example Input/Output Files
Create `input.txt` and `output.txt` for test cases:

**input.txt:**
```
5
1 4 2 8 3
5
```

**output.txt:**
```
Sorted Array: 1 2 3 4 8
Array Size: 5
```

## File Organization

### Adding New Algorithm/Data Structure
```
Java + DSA + Interview Preperation/
└── VXX YourNewTopic/
    ├── YourAlgorithm.java          # Main implementation
    ├── input.txt                    # Sample input (optional)
    └── output.txt                   # Expected output (optional)
```

### Naming Guidelines
- Use descriptive, clear names
- Avoid abbreviations unless widely recognized
- Match existing folder naming conventions
- Be consistent with camelCase for files

## Testing Your Code

Before submitting a PR, ensure your code:

1. **Compiles without errors**
   ```bash
   javac "path/to/YourAlgorithm.java"
   ```

2. **Runs without exceptions**
   ```bash
   java YourAlgorithm < input.txt > output.txt
   ```

3. **Produces correct output**
   - Test with edge cases
   - Test with typical inputs
   - Verify algorithm complexity

### Example Test Cases to Include
```
// Edge Cases
- Empty input
- Single element
- Negative numbers
- Large inputs

// Typical Cases
- Standard sized input
- Different data patterns
- Boundary conditions
```

## Pull Request Checklist

Before submitting, verify:

- [ ] Code compiles without errors
- [ ] Code runs successfully
- [ ] Comments are clear and meaningful
- [ ] No unnecessary comments or debug code
- [ ] Follows Java naming conventions
- [ ] Includes sample input/output (if applicable)
- [ ] Commit message is descriptive
- [ ] No merge conflicts
- [ ] Related issues are referenced
- [ ] No large binary files added
- [ ] README updated (if necessary)

## Review Process

1. **Initial Review**: Maintainers check code quality and style
2. **Testing**: Code is tested for correctness
3. **Feedback**: You receive comments and suggestions
4. **Revisions**: You make requested changes
5. **Merge**: Once approved, your PR is merged!

## Common Issues & Solutions

### Issue: "Merge conflicts"
```bash
# Update your branch with latest main
git fetch upstream
git rebase upstream/main

# Or merge instead of rebase
git merge upstream/main

# Resolve conflicts in your editor, then:
git add .
git commit -m "Resolve merge conflicts"
git push origin your-branch-name
```

### Issue: "Need to update code after PR submission"
```bash
# Make your changes locally
git add .
git commit -m "Update: Further improvements to algorithm"
git push origin your-branch-name
# Your PR automatically updates with new commits!
```

### Issue: "Want to squash multiple commits"
```bash
# Before pushing, squash last N commits
git rebase -i HEAD~3  # squash last 3 commits
```

## Communication Guidelines

- **Be Respectful**: Treat all contributors with respect
- **Be Constructive**: Offer helpful criticism with suggestions
- **Be Patient**: Reviews take time; maintainers volunteer
- **Ask Questions**: If unsure about something, ask in comments or discussions
- **Provide Context**: When reporting issues, provide clear steps to reproduce

## What We're Looking For

### High Priority Contributions
- Graph algorithms (BFS, DFS, Dijkstra, Kruskal's, etc.)
- Dynamic Programming implementations
- Advanced Data Structures (Trees, Heaps, Tries, Segments Trees)
- Popular LeetCode/InterviewBit problem solutions
- Performance optimizations

### Also Welcome
- Bug fixes
- Code refactoring
- Better documentation
- Test cases and examples
- Comments explaining algorithms
- Time/space complexity analysis

## Recognition

Contributors are recognized in the [README.md](README.md) and [CHANGELOG.md](CHANGELOG.md). We appreciate all the help!

## Questions or Need Help?

- 📖 Check [README.md](README.md) for overview
- 💬 Start a [Discussion](https://github.com/your-username/DSA/discussions)
- 🐛 [Open an Issue](https://github.com/your-username/DSA/issues) for bugs
- 📧 Reach out to maintainers for complex questions

---

**Thank you for contributing! Happy coding! 🚀**
