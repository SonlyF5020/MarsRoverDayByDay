#!/bin/sh
echo "git push test"
git rm --cached .idea\*
git add .
git commit -m "refactor"
git push
echo "git done"