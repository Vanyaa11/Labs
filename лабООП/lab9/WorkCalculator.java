/* eslint-disable */

import React from "react";

const scripts = [
  {
    loading: fetch(
      "https://d3e54v103j8qbb.cloudfront.net/js/jquery-3.5.1.min.dc5e7f18c8.js?site=65dc7f80e7a5f61962bb23ee",
    ).then((body) => body.text()),
    isAsync: false,
  },
  {
    loading: fetch("js/webflow.js").then((body) => body.text()),
    isAsync: false,
  },
];

class IndexView extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      loading: true, 
    };
  }

  componentDidMount() {
    const htmlEl = document.querySelector("html");
    htmlEl.dataset["wfPage"] = "65dc7f80e7a5f61962bb23f5";
    htmlEl.dataset["wfSite"] = "65dc7f80e7a5f61962bb23ee";

    scripts
    .concat(null)
    .reduce((active, next) =>
      Promise.resolve(active).then((active) => {
        const loading = active.loading.then((script) => {
          new Function(`
          with (this) {
            eval(arguments[0])
          }
        `).call(window, script);

          return next;
        });
        return active.isAsync ? next : loading;
      }),
    ).then(() => {
      this.setState({ loading: false }); 
    });
  }
  render() {
    return (
    <>
    {this.state.loading  ?  
     (
       <div
       id="newloftloader-wrapper"
       className="newloftloader-imgloading newimgloading-vertical newtop-to-bottom"
     >
       <div id="newloader" className="newcenter-loader">
         <div className="newimgloading-container">
           <div className="img-loader-wrapper">
             <img
               className="loader-img left skip-lazy"
               src="/images/UABlogo.svg"
               alt="logo"
               data-no-lazy="1"
             />
             <img
               className="loader-img right skip-lazy "
               src="/images/UAB-name.png"
               alt="name"
               data-no-lazy="1"
             />
           </div>
         </div>
       </div>
     </div>
    ):
     (<span>
      <style
        dangerouslySetInnerHTML={{
          __html: `
        @import url(/css/normalize.css);
        @import url(/css/webflow.css);
        @import url(/css/test-site-17d291.webflow.css);


            @media (min-width: 992px) {
              html.w-mod-js:not(.w-mod-ix) [data-w-id=\"01920043-fdda-603c-c3a4-a0cf44a58d6c\"] {
                -webkit-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                -moz-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                -ms-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                display: none;
                opacity: 0;
              }

              html.w-mod-js:not(.w-mod-ix) [data-w-id=\"2a79d6e1-2319-b8c5-03bf-b84c9b7660f3\"] {
                -webkit-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                -moz-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                -ms-transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                transform: translate3d(0, 2rem, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0);
                display: none;
                opacity: 0;
              }

              html.w-mod-js:not(.w-mod-ix) [data-w-id=\"d7460af2-40d7-56ac-a3c2-c0ebabf721b9\"] {
                opacity: 0;
              }
            }
      `,
        }}
      />
      <span className="af-view">
        <div className="af-class-body">
          <div
            data-w-id="179f745d-dd0c-a113-baae-d3e684d4f755"
            className="af-class-scroll-prompt-wrapper af-class-spw1"
          >
            <div className="af-class-scroll-prompt-intro">
              <div className="af-class-scroll-prompt-undercircle" />
              <a
                href="#"
                className="af-class-scroll-prompt-btn w-inline-block"
              >
                <div>Why does this matter?</div>
                <div className="af-class-scroll-prompt-ico">
                  <div className="af-class-ico af-class-scroll w-embed">
                    <svg viewBox="0 0 16 16">
                      <path
                        fill="CurrentColor"
                        d="M7.37 10.72a1 1 0 0 1 0-1.36l4-4.08a.94.94 0 0 1 1.33 0 1 1 0 0 1 0 1.36l-4 4.08a1 1 0 0 1-1.33 0z"
                      ></path>
                      <path
                        fill="CurrentColor"
                        d="M3.28 5.28a.94.94 0 0 1 1.33 0l4.1 4.08a1 1 0 0 1 0 1.36 1 1 0 0 1-1.34 0L3.28 6.64a1 1 0 0 1 0-1.36z"
                      ></path>
                    </svg>
                  </div>
                </div>
              </a>
            </div>
          </div>
          <div
            data-animation="default"
            data-collapse="medium"
            data-duration={400}
            data-easing="ease"
            data-easing2="ease"
            role="banner"
            className="af-class-navbar w-nav"
          >
            <div className="af-class-main-container af-class-cc-navbar w-container">
              <div className="af-class-navbar__content-wrapper">
                <img
                  src="images/UAB-LOGO---PNG.png"
                  loading="lazy"
                  sizes="(max-width: 479px) 100vw, 138.6632080078125px"
                  srcSet="
              images/UAB-LOGO---PNG-p-500.png   500w,
              images/UAB-LOGO---PNG-p-800.png   800w,
              images/UAB-LOGO---PNG-p-1080.png 1080w,
              images/UAB-LOGO---PNG.png        1366w
            "
                  alt={""}
                  className="af-class-image-7"
                />
                <nav
                  role="navigation"
                  className="af-class-navbar__nav-menu w-nav-menu"
                >
                  <a
                    className="af-class-frame-1171274904"
                    href="/login"
                    target="_top"
                  >
                    <div className="af-class-text-5">Online Banking</div>
                  </a>
                  <a
                    className="af-class-frame-1171274915"
                    href="/registration"
                    target="_top"
                  >
                    <div className="af-class-text-6">Open an Account</div>
                  </a>
                </nav>
                <div className="w-nav-button">
                  <div className="w-icon-nav-menu" />
                </div>
              </div>
            </div>
          </div>
          <div
            data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bba"
            className="af-class-scene-1"
          >
            <div
              style={{ opacity: 0 }}
              className="af-class-scroll-prompt-wrapper-initial"
            >
              <div
                data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bbc"
                className="af-class-scroll-prompt-intro-initial"
              >
                <div
                  href="#imagine"
                  className="af-class-scroll-prompt-btn af-class-initial"
                >
                  <div
                    style={{
                      WebkitTransform:
                        "translate3d(0, 0%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                      MozTransform:
                        "translate3d(0, 0%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                      msTransform:
                        "translate3d(0, 0%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                      transform:
                        "translate3d(0, 0%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                      opacity: 1,
                    }}
                    className="af-class-scroll-prompt-ico af-class-initial"
                  >
                    <div className="af-class-ico af-class-scroll w-embed">
                      <svg viewBox="0 0 16 16">
                        <path
                          fill="CurrentColor"
                          d="M7.37 10.72a1 1 0 0 1 0-1.36l4-4.08a.94.94 0 0 1 1.33 0 1 1 0 0 1 0 1.36l-4 4.08a1 1 0 0 1-1.33 0z"
                        ></path>
                        <path
                          fill="CurrentColor"
                          d="M3.28 5.28a.94.94 0 0 1 1.33 0l4.1 4.08a1 1 0 0 1 0 1.36 1 1 0 0 1-1.34 0L3.28 6.64a1 1 0 0 1 0-1.36z"
                        ></path>
                      </svg>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div
              data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bc2"
              className="af-class-ix-intro-facts-trigger"
            />
            <div className="af-class-scene-1-bg-2" />
            <div
              data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bc4"
              className="af-class-ix-scroll-prompt"
            />
            <div
              data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bc5"
              className="af-class-browser-globe-scene-wrapper"
            >
              <div
                style={{ display: "block" }}
                className="af-class-browser-overflow-wrapper"
              >
                <div className="af-class-globe">
                  <div className="af-class-browser-window-wrapper">
                    <div className="af-class-browser-window-inner-wrapper">
                      <div className="af-class-browser-window">
                        <div className="af-class-browser-btns-wrapper">
                          <div className="af-class-browser-btn" />
                          <div className="af-class-browser-btn" />
                          <div className="af-class-browser-btn" />
                        </div>
                        <div className="af-class-hemisphere-west">
                          <img
                            src="images/Asset-4-2.svg"
                            loading="lazy"
                            alt={""}
                          />
                          <section className="af-class-globe-stat af-class-latin af-class-south">
                            <div
                              style={{
                                WebkitTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                MozTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                msTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                transform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                              }}
                              className="af-class-stat-ping af-class-rus"
                            />
                            <div
                              style={{
                                WebkitTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                MozTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                msTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                transform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                              }}
                              className="af-class-stat-ping af-class-large af-class-_400"
                            />
                          </section>
                          <div className="af-class-globe-stat af-class-germ">
                            <div
                              style={{
                                WebkitTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                MozTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                msTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                transform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                              }}
                              className="af-class-stat-ping af-class-rus"
                            />
                            <div
                              style={{
                                WebkitTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                MozTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                msTransform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                transform:
                                  "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                              }}
                              className="af-class-stat-ping af-class-large af-class-_400"
                            />
                          </div>
                        </div>
                        <div className="af-class-hemisphere-east">
                          <div className="af-class-hemisphere-east-continents">
                            <section className="af-class-globe-stat af-class-rus">
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-rus"
                              />
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-large af-class-_400"
                              />
                            </section>
                            <section className="af-class-globe-stat af-class-norway af-class-africa">
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-rus"
                              />
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-large af-class-_400"
                              />
                            </section>
                            <img
                              src="images/Asset-5.svg"
                              loading="lazy"
                              alt={""}
                            />
                            <div className="af-class-globe-stat af-class-norway af-class-new">
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-rus"
                              />
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-large af-class-_400"
                              />
                            </div>
                            <section className="af-class-globe-stat af-class-norway">
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-rus"
                              />
                              <div
                                style={{
                                  WebkitTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  MozTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  msTransform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                  transform:
                                    "translate3d(0, 0, 0) scale3d(0, 0, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                                }}
                                className="af-class-stat-ping af-class-large af-class-_400"
                              />
                            </section>
                          </div>
                        </div>
                        <div
                          data-is-ix2-target={1}
                          className="af-class-lottie-globe"
                          data-w-id="0227c2d1-b6bf-e511-b1f5-082403dbc3ea"
                          data-animation-type="lottie"
                          data-src="documents/65eeab3cca92833855c20353_globe-white-1.json"
                          data-loop={0}
                          data-direction={1}
                          data-autoplay={0}
                          data-renderer="svg"
                          data-default-duration={3}
                          data-duration={0}
                        />
                        <div className="af-class-triangles-wrapper">
                          <div className="af-class-triangles-1">
                            <img
                              src="https://uploads-ssl.webflow.com/65eea9fbabcd3b71cdd5eb0c/65eea9fbabcd3b71cdd5eb83_ill-triangles-1.svg"
                              alt={""}
                              className="af-class-img-triangles-1"
                            />
                          </div>
                          <div className="af-class-triangles-2">
                            <img
                              src="https://uploads-ssl.webflow.com/65eea9fbabcd3b71cdd5eb0c/65eea9fbabcd3b71cdd5ebcd_ill-triangles-2.svg"
                              alt={""}
                              className="af-class-img-triangles-2"
                            />
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div
                data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5bf6"
                style={{ display: "flex" }}
                className="af-class-intro-text-wrapper"
              >
                <div className="af-class-intro-title-wrapper af-class-intro af-class-mb-normal">
                  <div className="af-class-h-oversized af-class-intro-1 af-class-p-gradient-1">
                    Welcome
                  </div>
                  <div className="af-class-h-oversized af-class-intro-2">
                    Welcome
                  </div>
                  <div className="af-class-h-oversized af-class-intro-3">
                    Welcome
                  </div>
                </div>
                <div
                  style={{
                    opacity: 0,
                    WebkitTransform:
                      "translate3d(0, 0, 0) scale3d(0.5, 0.5, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                    MozTransform:
                      "translate3d(0, 0, 0) scale3d(0.5, 0.5, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                    msTransform:
                      "translate3d(0, 0, 0) scale3d(0.5, 0.5, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                    transform:
                      "translate3d(0, 0, 0) scale3d(0.5, 0.5, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                  }}
                  className="af-class-intro-subtitle-wrapper"
                >
                  <div className="af-class-p-huge af-class-p-bold af-class-new">
                    To The Future Of
                    <br />
                    &nbsp;Banking
                  </div>
                </div>
              </div>
              <div
                data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c01"
                className="af-class-ix-intro-title-trigger"
              />
              <div
                data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c02"
                className="af-class-ix-intro-globe-trigger"
              />
              <div className="af-class-intro-webflow-facts-wrapper">
                <div
                  data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c04"
                  className="af-class-ix-facts-1-trigger"
                />
                <div
                  data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c06"
                  className="af-class-ix-facts-title"
                />
                <div
                  data-w-id="a4b2d85c-e439-8ec5-ffc2-b0733413f355"
                  className="af-class-ix-facts-4-trigger"
                />
                <div
                  data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c09"
                  className="af-class-ix-darkness-expand-trigger"
                />
                <div className="af-class-grid-row af-class-facts">
                  <div className="af-class-webflow-facts">
                    <div className="af-class-webflow-facts-title">
                      <div className="af-class-webflow-facts-title-wrapper af-class-mb-normal">
                        <div className="af-class-p-huge af-class-p-bold af-class-_5">
                          Wherever You Are, We're There: Discover Our
                          Worldwide Banking Solutions.
                        </div>
                      </div>
                    </div>
                    <div className="af-class-webflow-facts-content">
                      <div className="af-class-fact1">
                        <div className="af-class-p-large">
                          Join the Universal Banking Revolution: Wherever You
                          Roam, We've Got You Covered.
                          <br />
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div
              data-w-id="f75e7039-c87c-57ab-e65f-d0c5327a5c4c"
              className="af-class-ix-show-hidden-progress"
            />
          </div>
          <div
            id="weglot"
            data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b7660a8"
            className="af-class-scene-4"
          >
            <div className="af-class-weglotis-wrapper-3">
              <div className="af-class-grid-row af-class-row-nomar af-class-weglot-is">
                <div className="af-class-col-3 af-class-nopad af-class-col-6 af-class-sticky">
                  <div className="af-class-half-page af-class-weglot-is af-class-nobg af-class-new">
                    <div className="af-class-weglot-is-wrapper-4">
                      <div
                        data-w-id="d039ee48-debb-8f2f-807d-7b3e67fc626d"
                        className="af-class-weglot-letters af-class-is"
                      >
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-w af-class-is"
                        >
                          <div className="af-class-text-block-11">K</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-w af-class-is"
                        >
                          <div className="af-class-text-block-11">e</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-w af-class-is"
                        >
                          <div className="af-class-text-block-11 af-class-_1 af-class-_2">
                            y
                          </div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-w af-class-is"
                        >
                          <div className="af-class-text-block-11">S</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-e af-class-is"
                        >
                          <div className="af-class-text-block-11">e</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-g af-class-is"
                        >
                          <div className="af-class-text-block-11">r</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-g af-class-is"
                        >
                          <div className="af-class-text-block-11">v</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-l af-class-is"
                        >
                          <div className="af-class-text-block-11">i</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-o af-class-is"
                        >
                          <div className="af-class-text-block-11">c</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-t af-class-is"
                        >
                          <div className="af-class-text-block-11">e</div>
                        </div>
                        <div
                          style={{
                            WebkitTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            MozTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            msTransform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                            transform:
                              "translate3d(0, 110%, 0) scale3d(1, 1, 1) rotateX(0) rotateY(0) rotateZ(0) skew(0, 0)",
                          }}
                          className="af-class-weglot-logo-letter af-class-wl-t af-class-is"
                        >
                          <div className="af-class-text-block-11">s</div>
                        </div>
                      </div>
                      <div className="af-class-weglot-is-desc af-class-de1 af-class-new">
                        <img
                          src="images/1.gif"
                          loading="lazy"
                          alt={""}
                          className="af-class-image-48"
                        />
                        <div className="af-class-p-large-2">
                          Experience banking at its finest with Universal
                          Assets Bank's Corporate &amp; Private Banking
                          division.Our team of seasoned professionals is
                          dedicated to providing unparalleled service and
                          customized solutions to corporations and discerning
                          individuals.
                        </div>
                      </div>
                      <div className="af-class-weglot-is-desc af-class-de2 af-class-new2">
                        <img
                          src="images/2.gif"
                          loading="lazy"
                          alt={""}
                          className="af-class-image-47"
                        />
                        <div className="af-class-p-large-2">
                          Say hello to a world without borders with Universal
                          Assets Bank's Cross Border Payments service. Whether
                          you're conducting business internationally or
                          supporting loved ones abroad, our secure and
                          efficient platform ensures seamless cross-border
                          transactions every time. Experience the power of
                          global connectivity with UAB as your trusted
                          financial partner.
                        </div>
                      </div>
                      <div className="af-class-weglot-is-desc af-class-de3 af-class-new3">
                        <img
                          src="images/3.gif"
                          loading="lazy"
                          alt={""}
                          className="af-class-image-47"
                        />
                        <div className="af-class-p-large-2">
                          Experience the benefits of transparency and security
                          with Universal Assets Bank's Client Money Account.
                          Your funds are held in segregated accounts, ensuring
                          clear separation from our own assets. Rest easy
                          knowing that your finances are protected and
                          accessible whenever you need them.
                          <br />
                        </div>
                      </div>
                      <div
                        data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b7660f3"
                        className="af-class-weglot-is-desc af-class-de5"
                      >
                        <img
                          src="images/Investmenet-Banking-4.gif"
                          loading="lazy"
                          alt={""}
                          className="af-class-image-47"
                        />
                        <div className="af-class-p-large-2 af-class-mb-small">
                          Invest with confidence with Universal Assets Bank's
                          Investment Banking solutions. Whether you're
                          exploring new opportunities or diversifying your
                          portfolio, our comprehensive range of services is
                          tailored to meet your unique
                          needs&nbsp;and&nbsp;objectives.
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="af-class-col-3 af-class-nopad af-class-col-6 af-class-weglot-is">
                  <div className="af-class-half-page af-class-is">
                    <div
                      data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b766100"
                      className="af-class-weglot-is-ill-wrapper af-class-iw1"
                    >
                      <img src="images/1.gif" loading="lazy" alt={""} />
                    </div>
                  </div>
                  <div className="af-class-half-page af-class-is">
                    <div
                      data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b76611c"
                      className="af-class-weglot-is-ill-wrapper af-class-iw2"
                    >
                      <img src="images/2.gif" loading="lazy" alt={""} />
                    </div>
                  </div>
                  <div className="af-class-half-page af-class-is">
                    <div
                      data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b76613a"
                      className="af-class-weglot-is-ill-wrapper af-class-iw3"
                    >
                      <img src="images/3.gif" loading="lazy" alt={""} />
                    </div>
                  </div>
                  <div className="af-class-half-page af-class-is af-class-new">
                    <div
                      data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b76614d"
                      className="af-class-weglot-is-ill-wrapper af-class-iw4"
                    >
                      <img
                        src="images/Investmenet-Banking-4.gif"
                        loading="lazy"
                        alt={""}
                      />
                    </div>
                  </div>
                </div>
                <div
                  data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b766166"
                  className="af-class-ix-scroll-prompt"
                />
              </div>
              <div
                data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b766167"
                className="af-class-ix-weglot-is-trigger1"
              />
              <div
                data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b766168"
                className="af-class-ix-weglot-is-trigger2"
              />
              <div
                data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b766169"
                className="af-class-ix-weglot-is-trigger3"
              />
              <div
                data-w-id="2a79d6e1-2319-b8c5-03bf-b84c9b76616a"
                className="af-class-ix-weglot-is-trigger4"
              />
              <div
                data-w-id="4a9ec2b4-a377-17e2-7aaa-dac15bd5609e"
                className="af-class-ix-weglot-is-trigger5"
              />
            </div>
          </div>
          <div
            data-w-id="d0648fc7-b0fd-404b-3939-69e5946e1930"
            className="af-class-section-4-new af-class-scene-2"
          >
            <div className="af-class-intro__workflow">
              <section
                id="home"
                data-w-id="719218c7-9534-9c06-7f92-8456fbbb5f3b"
                className="af-class-section-8 af-class-mod--hero"
              >
                <div
                  data-w-id="708c6783-3f6c-eab7-d955-f6318bfb7cbe"
                  className="af-class-intro__workflow-text"
                >
                  <h2 className="af-class-intro__workflow-heading">
                    Your financial aspirations deserve the best support
                  </h2>
                  <p className="af-class-intro__workflow-paragraph">
                    Contact Universal Assets Bank to discover how our
                    innovative banking solutions can help you achieve your
                    goals. Join us at the forefront of financial innovation.
                  </p>
                </div>
                <div className="af-class-card-contain-2">
                  <div
                    data-w-id="c0b55399-f8c0-06ad-1f17-b5a2c71a033f"
                    className="af-class-circle1-2"
                  />
                  <div
                    data-w-id="c0b55399-f8c0-06ad-1f17-b5a2c71a0340"
                    className="af-class-circle2-2"
                  />
                  <div
                    data-w-id="c0b55399-f8c0-06ad-1f17-b5a2c71a0341"
                    className="af-class-card-2"
                  />
                </div>
              </section>
            </div>
          </div>
          <div
            data-w-id="d0648fc7-b0fd-404b-3939-69e5946e1930"
            className="af-class-section-4-new af-class-scene-2"
          >
            <div
              data-w-id="b9452c1b-ecf9-448a-6f45-f04976090a4b"
              className="af-class-content-2"
            >
              <div className="af-class-grow__columns">
                <div className="af-class-grow__col af-class-mod--2 af-class-new">
                  <div className="af-class-anim-wrap">
                    <h2 className="af-class-heading2-2">
                      Fast and Secure Receive Your Funds Instantly
                    </h2>
                  </div>
                  <p style={{ opacity: 1 }} className="af-class-grow__desc">
                    Navigate the world of virtual assets with confidence with
                    our expert guidance and personalized advice. From
                    portfolio management to risk assessment, our team is here
                    to help you make informed decisions.
                  </p>
                </div>
                <div className="af-class-grow__col af-class-mod--1">
                  <div className="af-class-app__col">
                    <div className="af-class-app__phone-block">
                      <div className="af-class-app__phone-wrap">
                        <img
                          src="images/Sending---test-dark-2.gif"
                          loading="eager"
                          alt={""}
                          width={271}
                          className="af-class-app__phone af-class-new"
                        />
                      </div>
                    </div>
                  </div>
                </div>
                <div className="af-class-grow__col af-class-mod--2">
                  <div className="af-class-anim-wrap">
                    <h2 className="af-class-heading2">
                      Your Path to Seamless And Effortless Transactions
                    </h2>
                  </div>
                  <p style={{ opacity: 1 }} className="af-class-grow__desc">
                    Navigate the world of virtual assets with confidence with
                    our expert guidance and personalized advice. From
                    portfolio management to risk assessment, our team is here
                    to help you make informed decisions.
                  </p>
                </div>
              </div>
            </div>
            <div
              data-w-id="45ae3738-c860-0c23-0f91-32f0a01d248c"
              className="af-class-content-2 af-class-new"
            >
              <div className="af-class-grow__columns af-class-new">
                <div className="af-class-grow__col af-class-mod--2 af-class-new1">
                  <div className="af-class-anim-wrap">
                    <h2 className="af-class-heading2">
                      Fast and Secure Receive Your Funds Instantly
                    </h2>
                  </div>
                  <p style={{ opacity: 1 }} className="af-class-grow__desc">
                    Accept a variety of payment methods with our secure
                    platform, designed to reduce transaction friction and
                    protect your financial information.
                  </p>
                </div>
                <div className="af-class-grow__col af-class-mod--2 af-class-new">
                  <div className="af-class-anim-wrap">
                    <h2 className="af-class-heading2-2">
                      Your Path to Seamless And Effortless Transactions
                    </h2>
                  </div>
                  <p style={{ opacity: 1 }} className="af-class-grow__desc">
                    Accept a variety of payment methods with our secure
                    platform, designed to reduce transaction friction and
                    protect your financial information.
                  </p>
                </div>
                <div className="af-class-grow__col af-class-mod--1 af-class-new">
                  <div className="af-class-app__col">
                    <div className="af-class-app__phone-block af-class-new">
                      <div className="af-class-app__phone-wrap">
                        <img
                          src="images/uab-phone-mockup-receiving-.gif"
                          loading="eager"
                          alt={""}
                          width={271}
                          className="af-class-app__phone_1"
                        />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="af-class-section-4 af-class-scene-2">
            <div className="af-class-sharing">
              <div
                data-w-id="a04ac92f-9115-9914-5758-3155df02d1a0"
                className="af-class-sharing__text"
              >
                <h2 className="af-class-sharing__text-heading">
                  Become a UAB customer in easy steps
                </h2>
                <p className="af-class-sharing__text-paragraph">
                  UAB is committed to make banking more rewarding for you
                </p>
              </div>
              <div
                className="af-class-sharing__wrapper"
                data-w-id="a04ac92f-9115-9914-5758-3155df02d1a5"
              >
                <div
                  data-w-id="a04ac92f-9115-9914-5758-3155df02d1a6"
                  className="af-class-sharing__plane-wrapper"
                >
                  <img
                    src="images/15.png"
                    alt={""}
                    data-w-id="a04ac92f-9115-9914-5758-3155df02d1a7"
                    className="af-class-sharing__plane"
                  />
                  <img
                    src="images/shadow_1shadow.png"
                    alt={""}
                    data-w-id="a04ac92f-9115-9914-5758-3155df02d1a8"
                    className="af-class-sharing__plane-shadow"
                  />
                </div>
                <img
                  src="images/bottom right.png"
                  data-w-id="d7460af2-40d7-56ac-a3c2-c0ebabf721b9"
                  alt={""}
                  className="af-class-sharing__invite-2"
                />
                <img
                  src="images/file-1.png"
                  loading="lazy"
                  sizes="(max-width: 479px) 100vw, (max-width: 991px) 34vw, (max-width: 1279px) 302.13543701171875px, 350.0000305175781px"
                  srcSet="images/file-1-p-500.png 500w, images/file-1.png 674w"
                  alt={""}
                  className="af-class-sharing__hand"
                />
                <img
                  src="images/2.png"
                  loading="lazy"
                  sizes="(max-width: 479px) 100vw, (max-width: 991px) 96vw, (max-width: 1279px) 863.2813110351562px, (max-width: 1919px) 1000.0000610351562px, 1203.9931640625px"
                  srcSet="
              images/2-p-500.png   500w,
              images/2-p-800.png   800w,
              images/2-p-1080.png 1080w,
              images/2.png        1326w
            "
                  alt={""}
                  className="af-class-sharing__image"
                />
                <img
                  src="images/top left.png"
                  alt={""}
                  className="af-class-sharing__access"
                />
              </div>
            </div>
            <div
              data-w-id="c02c5fc6-331e-25d9-74be-05e1b7e8e146"
              className="af-class-div-block-4"
            >
              <div className="af-class-frame-811629 af-class-new">
                <img
                  src="images/Asset-294x.png"
                  loading="lazy"
                  sizes="(max-width: 1279px) 43.99305725097656px, (max-width: 1439px) 3vw, (max-width: 1919px) 43.99305725097656px, 65.98958587646484px"
                  srcSet="
              images/Asset-294x-p-500.png   500w,
              images/Asset-294x-p-800.png   800w,
              images/Asset-294x-p-1080.png 1080w,
              images/Asset-294x-p-1600.png 1600w,
              images/Asset-294x.png        1908w
            "
                  alt={""}
                  className="af-class-rectangle-7579"
                />
                <div className="af-class-txt-wrapper af-class-new1">
                  <div className="af-class-error af-class-new">
                    Registration
                  </div>
                  <div className="af-class-error af-class-new2">
                    Registration - Basic data filing process through the
                    provided form in the application.
                  </div>
                </div>
              </div>
              <div className="af-class-frame-811629">
                <img
                  src="images/Asset-304x.png"
                  loading="lazy"
                  sizes="(max-width: 1279px) 70px, (max-width: 1439px) 5vw, 70px"
                  srcSet="
              images/Asset-304x-p-500.png   500w,
              images/Asset-304x-p-800.png   800w,
              images/Asset-304x-p-1080.png 1080w,
              images/Asset-304x-p-1600.png 1600w,
              images/Asset-304x-p-2000.png 2000w,
              images/Asset-304x.png        2256w
            "
                  alt={""}
                  className="af-class-image-27"
                />
                <div className="af-class-txt-wrapper af-class-new2">
                  <div className="af-class-error af-class-new">
                    Account Verification
                  </div>
                  <div className="af-class-error">
                    Account Verification - The verification process of email
                    account and/or phone number registered in the application.
                  </div>
                </div>
              </div>
              <div className="af-class-frame-811629">
                <img
                  src="images/Asset-24x.png"
                  loading="lazy"
                  sizes="(max-width: 1279px) 43.99305725097656px, (max-width: 1439px) 3vw, 43.99305725097656px"
                  srcSet="
              images/Asset-24x-p-500.png   500w,
              images/Asset-24x-p-800.png   800w,
              images/Asset-24x-p-1080.png 1080w,
              images/Asset-24x-p-1600.png 1600w,
              images/Asset-24x-p-2000.png 2000w,
              images/Asset-24x-p-2600.png 2600w,
              images/Asset-24x-p-3200.png 3200w,
              images/Asset-24x.png        5711w
            "
                  alt={""}
                  className="af-class-image-28"
                />
                <div className="af-class-txt-wrapper af-class-new3">
                  <div className="af-class-error af-class-new">
                    Get Full Access
                  </div>
                  <div className="af-class-error">
                    Data validation - The process to validating data provided
                    in the related channels performed by application system in
                    the backend.
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div
            data-w-id="51281bd0-0155-fda1-dff3-cebc399b4415"
            className="af-class-formatting af-class-scene-2"
          >
            <div className="af-class-formatting__wrapper">
              <div
                className="af-class-formatting__lottie af-class-mobile-hide"
                data-w-id="51281bd0-0155-fda1-dff3-cebc399b4417"
                data-animation-type="lottie"
                data-src="documents/66269e54e8b3c4db8b968536_snap-1-2.json"
                data-loop={0}
                data-direction={1}
                data-autoplay={0}
                data-is-ix2-target={2}
                data-renderer="svg"
                data-default-duration="0.5517241379310345"
                data-duration={0}
              />
              <div className="af-class-formatting__text">
                <h2
                  data-w-id="51281bd0-0155-fda1-dff3-cebc399b4419"
                  className="af-class-formatting__heading"
                >
                  Empower Your Finances with UAB's Digital Banking Tools
                </h2>
                <img
                  src="images/1.png"
                  loading="lazy"
                  sizes="100vw"
                  srcSet="
              images/1-p-500.png  500w,
              images/1-p-800.png  800w,
              images/1.png       1080w
            "
                  alt={""}
                  className="af-class-image-42"
                />
                <p
                  data-w-id="51281bd0-0155-fda1-dff3-cebc399b441b"
                  className="af-class-formatting__paragraph af-class-formatting__paragraph--space"
                >
                  Experience the power of digital banking with Universal
                  Assets Bank's innovative features. From state-of-the-art
                  encryption to seamless digital asset management, our
                  technology-driven solutions put you in control of your
                  finances like never before.
                </p>
                <p
                  data-w-id="51281bd0-0155-fda1-dff3-cebc399b441e"
                  className="af-class-formatting__paragraph"
                >
                  Whether you’re a casual builder or you work on slides every
                  day, Pitch gives your team design superpowers.
                  <br />
                </p>
              </div>
            </div>
          </div>
          <div className="af-class-integrations af-class-scene-2">
            <div className="af-class-integrations__wrapper">
              <div
                data-w-id="8b21366c-2812-9980-c3a6-a240f8a6d4cf"
                className="af-class-integrations__text"
              >
                <h2 className="af-class-integrations__text-heading">
                  Ready to get started?
                </h2>
                <p className="af-class-integrations__text-paragraph">
                  Open your account to upgrade your banking experience Easy
                  and seamless registration steps to enjoy our advanced
                  digital banking&nbsp;Features
                </p>
              </div>
              <div
                data-w-id="e3553d3a-4ecb-c94b-b219-48da84b4a11d"
                className="af-class-integrations__animation"
              >
                <div
                  className="af-class-lottie-animation-4"
                  data-w-id="df14e25d-988d-d225-6886-d0495bbd9c14"
                  data-animation-type="lottie"
                  data-src="documents/Animation---1713968154775-1.json"
                  data-loop="1"
                  data-direction="1"
                  data-autoplay="1"
                  data-is-ix2-target="0"
                  data-renderer="svg"
                  data-default-duration="1.68"
                  data-duration="0"
                />

                <div className="af-class-cta__wrapper w-form">
                  <form
                    id="email-form"
                    name="email-form"
                    data-name="Email Form"
                    method="get"
                    className="af-class-cta-div"
                    data-wf-page-id="65dc7f80e7a5f61962bb23f5"
                    data-wf-element-id="fdcf51ae-6f96-74f5-5d09-4c050db5185c"
                  >
                    <a
                      className="af-class-cta__button w-button"
                      href="/registration"
                      target="_top"
                    >
                      Open an Account
                    </a>
                  </form>
                  <div className="w-form-done">
                    <div>Thank you! Your submission has been received!</div>
                  </div>
                  <div className="w-form-fail">
                    <div>
                      Oops! Something went wrong while submitting the form.
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="af-class-footer af-class-scene-2">
            <div className="af-class-zxa-section-1">
              <div className="af-class-zxa-container-1">
                <div className="af-class-zxa-wrap-1">
                  <div className="af-class-div-block-32">
                    <div className="af-class-div-block-42">
                      <div
                        id="w-node-db8f22fa-298e-19e3-d394-de96092046d8-62bb23f5"
                        className="af-class-footer-section-2"
                      >
                        <div className="af-class-text-18 af-class-footer">
                          About Us
                        </div>
                        <a
                          href="./about-uab.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new2"
                        >
                          About UAB
                          <br />
                        </a>
                        <a
                          href="./fees-charging.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Fees and Charges
                          <br />
                        </a>
                        <a
                          href="#"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Learning Center
                          <br />
                        </a>
                        <a
                          href="./contact-us.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Contact&nbsp;Us
                          <br />
                        </a>
                      </div>
                      <div
                        id="w-node-f4470817-531c-34b0-9f02-2a5d77a5f07e-62bb23f5"
                        className="af-class-footer-section-2"
                      >
                        <div className="af-class-text-18 af-class-footer">
                          Legal
                        </div>
                        <a
                          href="./privacy-policy.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new2"
                        >
                          Privacy Policy
                          <br />
                        </a>
                        <a
                          href="./terms-conditions.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Terms &amp; Conditions
                          <br />
                        </a>
                        <a
                          href="./cookies-policy.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Cookies Policy&nbsp;
                          <br />
                        </a>
                        <a
                          href="./terms-of-use.html"
                          className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre"
                        >
                          Terms&nbsp;of&nbsp;Use
                          <br />
                        </a>
                      </div>
                      <div
                        id="w-node-_98b5851e-4fd3-9e02-e866-3edb8da39f3d-62bb23f5"
                        className="af-class-footer-section-2 af-class-new"
                      >
                        <div className="af-class-text-18 af-class-footer af-class-new1">
                          Affiliates
                        </div>
                        <div className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new2">
                          <strong className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new">
                            Universal Assets Bank Corporation - Dominica
                          </strong>
                          <br />
                        </div>
                        <div className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new">
                          <strong className="af-class-bold-text-4">
                            Universal Assets Payment Services LLC - UAE
                            <br />
                          </strong>
                          <br />
                        </div>
                        <div className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new">
                          <strong className="af-class-bold-text-2">
                            Universal Assets FZE - Managing Office
                            <br />
                          </strong>
                          <br />
                        </div>
                        <div className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new">
                          <strong className="af-class-bold-text af-class-new">
                            Universal Assets Payment Services Inc - US
                            <br />
                          </strong>
                          <br />
                        </div>
                      </div>
                    </div>
                  </div>
                  <div className="af-class-zxa-wrap-3">
                    <div className="af-class-zxa-decor-1">
                      <div className="af-class-text-18 af-class-footer">
                        Subcribe
                      </div>
                      <div className="af-class-company-and-team-press-careers-service-status-investor-relations-mission-roadmap-affiliates-and-partnerships-help-centre af-class-new">
                        <strong className="af-class-bold-text-4">
                          Stay tuned for our news and latest updates.
                          <br />
                        </strong>
                        <br />
                      </div>
                      <div className="af-class-form-block w-form">
                        <iframe
                          src="https://cdn.iframe.ly/api/iframe?app=1&url=https%3A%2F%2Fshare.hsforms.com%2F1yQc1G9xKTNep6yojGfxAYAr907b&key=462812a26b593f2dbfbfcbb14f6d699a"
                          style={{
                            width: "160%",
                            height: "auto",
                            border: 0,
                            transformOrigin: "0px 0px",
                            position: "relative",
                          }}
                          allowFullScreen="allowfullscreen"
                          sandbox="allow-same-origin allow-scripts allow-popups allow-forms"
                        ></iframe>
                      </div>
                      <div className="af-class-div-block-44">
                        <div className="af-class-zxa-a-wrap-1">
                          <a
                            href="https://x.com/UA_Bank"
                            style={{ pointerEvents: "all" }}
                            loading="lazy"
                          >
                            <img
                              src="/images/Vectors-Wrapper.svg"
                              className="af-class-zxa-a-icon-1"
                            />
                          </a>
                          <a
                            href="https://www.facebook.com/Universalassetsbank/"
                            style={{ pointerEvents: "all" }}
                          >
                            <img
                              src="/images/Vectors-Wrapper_1.svg"
                              loading="lazy"
                              alt={""}
                              className="af-class-zxa-a-icon-1"
                            />
                          </a>
                          <a
                            href="https://www.instagram.com/universalassetsbank/"
                            style={{ pointerEvents: "all" }}
                            loading="lazy"
                          >
                            <img
                              src="/images/Vectors-Wrapper_2.svg"
                              className="af-class-zxa-a-icon-1"
                            />
                          </a>
                          <a
                            href="https://www.linkedin.com/company/universal-assets-bank"
                            style={{ pointerEvents: "all" }}
                            loading="lazy"
                          >
                            <img
                              src="/images/Vectors-Wrapper_3.svg"
                              className="af-class-zxa-a-icon-1"
                            />
                          </a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="af-class-zxa-wrap-2">
                  <div className="af-class-discover-block-layout">
                    <div className="af-class-discover-block">
                      Discover our latest articles
                      <br />
                    </div>
                    <a href="#" className="af-class-discover-block">
                      <u>View All Blogs </u>
                      <br />
                    </a>
                  </div>
                  <div className="af-class-div-block-33">
                    <div className="af-class-div-block-34">
                      <img
                        className="af-class-blog_img"
                        src="images/1_1.png"
                        loading="lazy"
                        sizes="(max-width: 479px) 180px, (max-width: 767px) 18vw, (max-width: 991px) 17vw, (max-width: 1279px) 18vw, 180px"
                        srcSet="images/1_1-p-500.png 500w, images/1_1-p-800.png 800w, images/1_1.png 1080w"
                        alt={""}
                      />
                    </div>
                    <div className="af-class-div-block-35">
                      <img
                        className="af-class-blog_img"
                        src="images/2_1.png"
                        loading="lazy"
                        sizes="(max-width: 479px) 180px, (max-width: 767px) 18vw, (max-width: 991px) 17vw, (max-width: 1279px) 18vw, 180px"
                        srcSet="images/2_1-p-500.png 500w, images/2_1-p-800.png 800w, images/2_1.png 1080w"
                        alt={""}
                      />
                    </div>
                    <div className="af-class-div-block-36">
                      <img
                        className="af-class-blog_img"
                        src="images/3.png"
                        loading="lazy"
                        sizes="(max-width: 479px) 180px, (max-width: 767px) 18vw, (max-width: 991px) 17vw, (max-width: 1279px) 18vw, 180px"
                        srcSet="images/3-p-500.png 500w, images/3-p-800.png 800w, images/3.png 1080w"
                        alt={""}
                      />
                    </div>
                    <div className="af-class-div-block-37">
                      <img
                        className="af-class-blog_img"
                        src="images/4.png"
                        loading="lazy"
                        sizes="(max-width: 479px) 180px, (max-width: 767px) 18vw, (max-width: 991px) 17vw, (max-width: 1279px) 18vw, 180px"
                        srcSet="images/4-p-500.png 500w, images/4-p-800.png 800w, images/4.png 1080w"
                        alt={""}
                      />
                    </div>
                    <div className="af-class-div-block-38">
                      <img
                        className="af-class-blog_img"
                        src="images/5.png"
                        loading="lazy"
                        sizes="(max-width: 479px) 180px, (max-width: 767px) 18vw, (max-width: 991px) 17vw, (max-width: 1279px) 18vw, 180px"
                        srcSet="images/5-p-500.png 500w, images/5-p-800.png 800w, images/5.png 1080w"
                        alt={""}
                      />
                    </div>
                  </div>
                  <div className="af-class-zxa-b-wrap-1">
                    <div className="af-class-zxa-b-decor-2">
                      <div className="af-class-zxa-b-wra-2">
                        <div className="af-class-div-block-46">
                          <img
                            src="images/UAE_logos__5_-removebg-preview.png"
                            loading="lazy"
                            alt={""}
                            className="af-class-image-51"
                          />
                        </div>
                        <div className="af-class-text-footer">
                          © Universal Assets Bank 2024
                          <br />‍
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </span>
    </span>)}
    </>
    );
  }
}

export default IndexView;

/* eslint-enable */
