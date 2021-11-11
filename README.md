# Issue Reproduction

This repo reproduces [shadow-cljs issue #948][https://github.com/thheller/shadow-cljs/issues/948].

## Intructions

### Debug build

1. Clone repo
2. `npm i`
3. `npm start`
4. Open `http://localhost:8989/about.html` in the browser
5. Open the browser's JavaScript console

Note that there are no errors in the console, and that the page content is the
   header "About"

### Release build

1. `git clean -xdf`
2. `npm i`
3. `npm run release`
4. `npm run serve`
5. Open `http://localhost:8989/about.html` in the browser
6. Open the browser's JavaScript console

Results in:

* **Expected:** Same as debug build, namely no errors and page content is "About"
* **Actual:** Page content is "Loading..." and the JavaScript console shows an
  error: `TypeError: $jscomp.makeIterator is not a function`
