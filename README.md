
# Martian-Alloys

A Minecraft Fabric mod that adds some alloys.

![master build status](https://github.com/Martian-Mods/Martian-Alloys/actions/workflows/build.yml/badge.svg)
[![CodeFactor](https://www.codefactor.io/repository/github/martian-mods/martian-alloys/badge)](https://www.codefactor.io/repository/github/martian-mods/martian-alloys)

## Content

As the description, name, and everything else has thrown in your face, this mod adds some alloys. The mod by itself isn't much good, so mod authors can add their own alloys, along with making recipes that require the alloys from this mod. That way they have much more use.

Here's a list of alloys:

- Amethyst Iron
- Obsidiamond
- Rose Gold

But wait! There's more! Martian Alloys also adds some runes (Subject to being added to their own mod.) which can be used to enchant a tool.

> For example, if I have a Fire Aspect Rune, and I put a sword (Or any tool that can have fire aspect) in my offhand, then use the Rune, then my sword will get the maximum level of the Fire Aspect enchantment (That's 2).
>
> Though, you can only enchant the tool if it has no enchantments on it (If `<item>.isEnchantable()` for modders or nerds)

There are only some runes for now, but there will eventually be one for every in-game enchantment. For now, here's a list of them:

- Efficiency
- Fire Aspect
- Sharpness
- Efficiency
- Aqua Affinity
- Blast Protection
- Depth Strider
- Feather Falling
- Frost Walker
- Projectile Protection
- Protection
- Respiration
- Soul Speed
- Thorns

> Currently all runes are not obtainable, this will change. I'm not sure how they will be obtained yet. Potentially they will be in chests or they can be crafted. Though they will be rare or expensive, depending on which obtaining method is used. They are quite powerful.

## Contributing

Feel free to open a PR, edit whatever you want to your heart's content!

## Unstable Builds

Not every commit gets a version made for it, I.e, commit "Hello, World" doesn't have a version. It gets mixed into another version with some other commits.

Though, via Github Actions, every commit gets tested to confirm whatever gets pushed, works. If you click `Actions`, then `Build`, then any given commit. Then click `Artifacts` and download the `Artifacts.zip` file, inside that, is the JAR file.
