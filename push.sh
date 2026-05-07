#!/bin/bash
cd pog 2>/dev/null || true
git add .
echo "Enter commit message:"
read message
git commit -m "$message"
git push origin master
