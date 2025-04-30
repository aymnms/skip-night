<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![License][license-shield]][license-url]

<br />
<div align="center">
  <h3 align="center">SkipNight</h3>
  <p align="center">
    A Minecraft plugin that lets you skip the night even if not everyone is sleeping.
    <br />
    <a href="https://github.com/aymnms/skip-night"><strong>View the code »</strong></a>
    <br />
    <br />
    <a href="https://github.com/aymnms/skip-night/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/aymnms/skip-night/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>

---

## 📜 About The Project

`SkipNight` is a lightweight plugin that allows skipping the night in Minecraft **without requiring all players to sleep**.  
It works on **Minecraft 1.7 to 1.16**, filling the gap before the native `playersSleepingPercentage` gamerule introduced in 1.17.

- Tracks players entering and leaving beds
- Skips the night when at least half of the players are sleeping
- Fully compatible with Spigot and Paper
- Automatically disables itself on Minecraft 1.17+

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🔧 Built With

* Java 8
* Spigot API 1.8.8 (compatible 1.7.10–1.16.5)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🚀 Getting Started

### Prerequisites

- Java 8 (JDK)
- Spigot/Paper server between version 1.7 and 1.16

### Installation

1. Download the latest `.jar` from [Releases](https://github.com/aymnms/skip-night/releases)
2. Place it in the `plugins/` folder of your server
3. Start the server
4. You're done!

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🕹️ Usage

Whenever a player sleeps:
- A message appears showing how many are sleeping
- If half or more players are in bed, the night is skipped

If someone leaves bed or disconnects, the plugin automatically recalculates everything.

You’ll see messages like:
```
[SkipNight] aymnms would like to skip the night [1/2]
[SkipNight] The sun rises.
```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🗺 Roadmap

- [x] Version compatibility from 1.7 to 1.16
- [ ] Configurable sleep percentage
- [ ] Custom messages via `config.yml`
- [ ] Localization support (FR/EN)

See the [open issues](https://github.com/aymnms/skip-night/issues) for more ideas.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 🤝 Contributing

1. Fork the project
2. Create a feature branch (`git checkout -b feature/MyFeature`)
3. Commit your changes (`git commit -m 'Add MyFeature'`)
4. Push to your branch (`git push origin feature/MyFeature`)
5. Open a Pull Request

<a href="https://github.com/aymnms/skip-night/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=aymnms/skip-night" />
</a>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- MARKDOWN LINKS & IMAGES -->
[contributors-shield]: https://img.shields.io/github/contributors/aymnms/skip-night.svg?style=for-the-badge
[contributors-url]: https://github.com/aymnms/skip-night/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/aymnms/skip-night.svg?style=for-the-badge
[forks-url]: https://github.com/aymnms/skip-night/network/members
[stars-shield]: https://img.shields.io/github/stars/aymnms/skip-night.svg?style=for-the-badge
[stars-url]: https://github.com/aymnms/skip-night/stargazers
[issues-shield]: https://img.shields.io/github/issues/aymnms/skip-night.svg?style=for-the-badge
[issues-url]: https://github.com/aymnms/skip-night/issues
[license-shield]: https://img.shields.io/github/license/aymnms/skip-night.svg?style=for-the-badge
[license-url]: https://github.com/aymnms/skip-night/blob/master/LICENSE