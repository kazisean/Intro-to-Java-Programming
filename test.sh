#!/bin/bash

# Loop over all the directories that start with "Chapter"
for dir in Chapter*; do
    # Use a regular expression to capture the number and the rest of the text
    if [[ $dir =~ ^Chapter\ ([0-9]+)$ ]]; then
        # Extract the number
        num=${BASH_REMATCH[1]}
        # Rename the folder to "<number> Chapter"
        mv "$dir" "${num} Chapter"
    fi
done

