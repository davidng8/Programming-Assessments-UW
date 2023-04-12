
# Name: David Ng
# CSE 160
# Homework 2: DNA analysis

# This program reads in DNA sequencer output and computes statistics, such as
# the GC content, AT content, nucleotide counts, etc.  Run it from the command
# line like this:
#   python dna_analysis.py myfile.fastq
#
# For teaching purposes, a few more comments than normal have been added in
# to explain in detail what some Python constructs are doing.

# The sys module supports reading files, command-line arguments, etc.
import sys


# Function to convert the contents of dna_filename into a string of nucleotides
def filename_to_string(dna_filename):
    """
    dna_filename - the name of a file in expected file format
    Expected file format is: Starting with the second line of the file,
    every fourth line contains nucleotides.
    The function will read in all lines from the file containing nucleotides,
    concatenate them all into a single string, and return that string.
    """

    # YOU DO NOT NEED TO MODIFY THIS FUNCTION.

    # Creates a file object from which data can be read.
    inputfile = open(dna_filename)

    # String containing all nucleotides that have been read from the file so
    # far.
    seq = ""

    # The current line number (= the number of lines read so far).
    line_num = 0

    for line in inputfile:
        line_num = line_num + 1
        # if we are on the 2nd, 6th, 10th line...
        if line_num % 4 == 2:
            # Remove the newline characters from the end of the line
            line = line.rstrip()
            # Concatenate this line to the end of the current string
            seq = seq + line
    # close file
    inputfile.close()
    return seq


# Function to return GC Classification
def classify(gc_content):
    if gc_content > 0.56:
        classification = "high GC content"
    elif gc_content < 0.36:
        classification = "low GC content"
    else:
        classification = "moderate GC content"

    return classification
Instructor
| 01/29 at 10:47 pm
Grading comment:
-1: (-1.75 from autograder, +0.75 from correction) According to the spec, your function should only return the values "high", "moderate" or "low". You should think about how to make use of the return value in order to get the proper output format.



###########################################################################
# Main program begins here
#

# Check if the user provided an argument
if len(sys.argv) < 2:
    print("You must supply a file name as an argument when running this "
          "program.")
    sys.exit(2)

# Save the 1st argument provided by the user, as a string.
# Note: sys.argv[0] is the name of the program itself (dna_analysis.py)
file_name = sys.argv[1]

# Open the file and read in all nucleotides into a single string of letters
nucleotides = filename_to_string(file_name)

###
# Compute statistics
###

# YOUR CODE GOES BELOW THIS POINT

# Total nucleotides seen so far.
total_count = 0

# Number of G and C nucleotides seen so far.
gc_count = 0
at_count = 0

for base in nucleotides:
    total_count = total_count + 1

    # OK to change this code!
    if base == 'C' or base == 'G':
        gc_count = gc_count + 1
Instructor
| 01/29 at 11:33 pm
Grading comment:
-0: While we gave you this code originally, after implementing the g_count and c_count, you can see that also calculating the gc_count/at_count is redundant. Since gc_count = g_count + c_count (similar for at_count), this was unnecessary and can be calculated only once outside the loop.

    if base == 'A' or base == 'T':
Instructor
| 01/29 at 11:34 pm
Grading comment:
-0: It would be better to use a single if/elif/else block here than a series of discrete if statements. When you only want to execute one of the clauses, you should use a single if/elif/else block. A series of if statements like this implies that you might sometimes want multiple to execute, but this is not the case. 

        at_count = at_count + 1

c_count = 0
g_count = 0
a_count = 0
t_count = 0
all_counts = 0
for base in nucleotides:
Instructor
| 01/29 at 11:33 pm
Grading comment:
-0: All of your statistics can be calculated in one loop through the nucleotides. Instead of looping through the string multiple times, it would save time and be more efficient to calculate all of the counts once.

    if base == 'C':
        c_count = c_count + 1
    elif base == 'G':
        g_count = g_count + 1
    elif base == 'A':
        a_count = a_count + 1
    elif base == 'T':
        t_count = t_count + 1
