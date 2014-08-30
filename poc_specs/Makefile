tmpdir = tmp
projname = specs
sourcename = $(projname).tex
outfile = $(projname).pdf

.DEFAULT: $(outfile)

$(outfile) : $(tmpdir)/$(outfile)
	cp $< $@

$(tmpdir)/$(outfile): $(sourcename) $(tmpdir)
	pdflatex -output-directory=$(tmpdir) $< --draft
	pdflatex -output-directory=$(tmpdir) $< --draft
	pdflatex -output-directory=$(tmpdir) $<

$(tmpdir):
	mkdir $(tmpdir)
