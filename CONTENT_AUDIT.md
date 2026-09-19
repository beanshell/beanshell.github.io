# Content Audit

Audited 2026-09-19 against the published GitHub Pages site, the current
BeanShell 2.1.1 release, and linked external services.

## Fixed

- `faq.html` pointed to the retired ikayzo/Confluence FAQ endpoint, which
  returns HTTP 404.
- `docs.html` linked to an external example host that no longer resolves.
- `contact.html` and `download.html` promoted retired SourceForge mailing
  lists, archives, and bug tracker endpoints.
- The versioned manuals linked navigation, source, download, and servlet
  resources to the separate legacy `www.beanshell.org` site instead of this
  site.
- Servlet downloads pointed to legacy BeanShell 2.0b4 archives rather than
  the current 2.1.1 release assets.

## Medium Priority Fixed

- Removed obsolete roadmap, wishlist, WebLogic, and NetBeans/Forte entry
  points from `docs.html`; their public routes now redirect to current
  resources.
- Retired applet demos, the unsupported `runbsh.html` form, and the legacy
  user-info form while preserving their public routes with redirects.
- Replaced applet links in both versioned manuals with the maintained examples
  page and marked the feature removed.
- Redirected orphaned `bookplug.html`, `faqblockingio.html`, and `unit.html`.
- Replaced missing example-page home-button images with text links.
