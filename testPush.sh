#!/bin/sh
echo "git push test"
git rm --cached .idea\*
git add .
git commit -m "test"
git push
echo "git done"